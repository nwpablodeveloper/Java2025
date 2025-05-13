package controlador;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import modelo.Cliente;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import servicio.IClienteServicio;

import java.util.List;

@Component
@Data
@ViewScoped
public class IndexControlador {

    @Autowired
    IClienteServicio clienteServicio;

    private List<Cliente> clientes;

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
}
