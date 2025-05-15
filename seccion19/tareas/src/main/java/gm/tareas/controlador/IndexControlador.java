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

@Component
// Necesitamos implementar la interface de JavaFx
public class IndexControlador implements Initializable {

    // Instanciamos un logger para poder enviar mensajes por consola de esta misma clase
    public static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

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

    // El Observable detecta cualquier cambio en la tabla y lo actualiza de forma automatica
    private final ObservableList<Tarea> tareaList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Permitir que solo se pueda seleccionar 1 elemento de la tabla
        tareaTabla.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        configurarColumnas();
    }

    private void configurarColumnas(){
        idTareaColumna.setCellValueFactory(new PropertyValueFactory<>("idTarea"));
        nombreTareaColumna.setCellValueFactory(new PropertyValueFactory<>("nombreTarea"));
        responsableColumna.setCellValueFactory(new PropertyValueFactory<>("responsable"));
        estatusColumna.setCellValueFactory(new PropertyValueFactory<>("estatus"));

    }
}
