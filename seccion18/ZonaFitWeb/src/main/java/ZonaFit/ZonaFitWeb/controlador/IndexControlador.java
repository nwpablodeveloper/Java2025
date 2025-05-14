package ZonaFit.ZonaFitWeb.controlador;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import ZonaFit.ZonaFitWeb.modelo.Cliente;
import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ZonaFit.ZonaFitWeb.servicio.IClienteServicio;

import java.util.List;

@Component
@Data
@ViewScoped
public class IndexControlador{


    @Autowired
    IClienteServicio clienteServicio;

    private List<Cliente> clientes;
    private Cliente clienteSeleccionado;

    // Para mandar información a Log de nuestra App por consola
    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    // JSF (JavaServerFaces) se encarga de instanciarla de forma automatica y no necesitamos un constructor
    // Ante la ncesidad de tener un constructor usaremos algo similar @PostConstructor:

    @PostConstruct
    public void init(){
        cargarDatos();
    }

    public void cargarDatos(){
        this.clientes = this.clienteServicio.listarClientes();
        this.clientes.forEach(cliente -> logger.info(cliente.toString()));
    }

    public void agregarCliente(){
        this.clienteSeleccionado = new Cliente();
    }

    public void guardarCliente(){
        logger.info("Cliente a guardar: " + this.clienteSeleccionado);
        // Agregar Cliente a la DB
        if( this.clienteSeleccionado.getId() == null){
            // Si su id es Null, es cliente nuevo
            this.clienteServicio.guardarCliente(this.clienteSeleccionado);

            // Agregamos el cliente a la tabla de la Vista
            this.clientes.add(this.clienteSeleccionado);

            // Mandamos a mostrar un mensaje al usuario
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente Agregado"));
        }else{
            // Update
            clienteServicio.guardarCliente(this.clienteSeleccionado);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente actualizado"));
        }
        // Ocultar la ventana Modal disparando un script al widgetVar
        PrimeFaces.current().executeInitScript("PF('ventanaModalCliente').hide()");
        // Refrescamos la Tabla
        PrimeFaces.current().ajax().update("forma-clientes:mensajes", "forma-clientes:clientes-tabla");
        // Reset del objeto clienteSeleccionado
        this.clienteSeleccionado = null;
    }
}
