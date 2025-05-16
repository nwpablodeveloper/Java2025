package gm.tareas.controlador;

import gm.tareas.modelo.Tarea;
import gm.tareas.servicio.TareaServicio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.cell.PropertyValueFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.*;

// Necesitamos implementar la interface de JavaFx
@Component
public class IndexControlador implements Initializable {

    // Instanciamos un logger para poder enviar mensajes por consola de esta misma clase
    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    // Integramos el componente de servicio de Spring
    @Autowired
    private TareaServicio tareaServicio;

    // Mapeo de elementos de nuestra archivo .fxml
    @FXML // Indica que es un componente de nuestra vista (index.fxml es nuestra vista)
    private TableView<Tarea> tareaTabla; // Importar de javafx.scene.control

    @FXML
    private TableColumn<Tarea, Integer> idTareaColumna;

    @FXML
    private TableColumn<Tarea, String> nombreTareaColumna;

    @FXML
    private TableColumn<Tarea, String> responsableColumna;

    @FXML
    private TableColumn<Tarea, String> estatusColumna;

    @FXML
    private TextField nombreTareaTexto, responsableTexto, estatusTexto;

    private Integer idTareaInterno;


    // El Observable detecta cualquier cambio en la tabla y lo actualiza de forma automatica
    private final ObservableList<Tarea> tareaList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Iniciamos el componente de la tabla
        // Permitir que solo se pueda seleccionar 1 elemento de la tabla
        tareaTabla.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        // Mensaje que se muestra cuando la tabla esta vacia
        tareaTabla.setPlaceholder(new Label("No hay tareas cargadas en el sistema"));

        configurarColumnas();
        listarTareas();
    }

    private void configurarColumnas(){
        idTareaColumna.setCellValueFactory(new PropertyValueFactory<>("idTarea"));
        nombreTareaColumna.setCellValueFactory(new PropertyValueFactory<>("nombreTarea"));
        responsableColumna.setCellValueFactory(new PropertyValueFactory<>("responsable"));
        estatusColumna.setCellValueFactory(new PropertyValueFactory<>("estatus"));
    }

    private void listarTareas(){
        logger.info("\n**************************\n Ejecutando listado de tareas\n");
        tareaList.clear(); // El Observable nota que limpiamos la tabla
        tareaList.addAll(tareaServicio.listarTareas()); // Luego Carga toda la lista de tareas
        tareaTabla.setItems(tareaList); // Y por ultimo asigna los valores en la tabla
    }

    public void agregarTarea(){
        if(nombreTareaTexto.getText().isEmpty()){
            mostrarMensaje("Campos requeridos", "Campo de Tarea requerido ");
            nombreTareaTexto.requestFocus();
            return;
        }
        else {
            var tarea = new Tarea();
            recolectarDatosFormulario(tarea);
            tarea.setIdTarea(null);
            tareaServicio.guardarTarea(tarea);
            mostrarMensaje("Información", "Tarea Agregada");
            limpiarFormulario();
            listarTareas();
        }
    }

    public void cargarTareaFormulario(){
        var tarea = tareaTabla.getSelectionModel().getSelectedItem();
        if (tarea != null){
            this.idTareaInterno = tarea.getIdTarea();
            nombreTareaTexto.setText(tarea.getNombreTarea());
            responsableTexto.setText(tarea.getResponsable());
            estatusTexto.setText(tarea.getEstatus());
        }
    }

    public void recolectarDatosFormulario(Tarea tarea){
        if (idTareaInterno != null) tarea.setIdTarea(idTareaInterno);
        tarea.setNombreTarea(nombreTareaTexto.getText());
        tarea.setResponsable(responsableTexto.getText());
        tarea.setEstatus(estatusTexto.getText());
    }

    public void modificarTarea(){
        if (idTareaInterno == null ){
            mostrarMensaje("Información", "Debe seleccionar una tarea a modificar");
            return;
        }
        if (nombreTareaTexto.getText().isEmpty()){
            mostrarMensaje("Error", "Falta la tarea");
            nombreTareaTexto.requestFocus();
            return;
        }
        var tarea = new Tarea();
        recolectarDatosFormulario(tarea);
        tareaServicio.guardarTarea(tarea);
        mostrarMensaje("Información", "Tarea Modificada");
        limpiarFormulario();
        listarTareas();
    }

    public void limpiarFormulario(){
        idTareaInterno = null;
        nombreTareaTexto.clear();
        nombreTareaTexto.requestFocus();
        responsableTexto.clear();
        estatusTexto.clear();
    }

    public void mostrarMensaje(String titulo, String mensaje){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

}
