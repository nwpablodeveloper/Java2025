package servicio;

import modelo.Cliente;
import org.springframework.stereotype.Component;

import java.util.List;


public interface IClienteServicio {
    public List<Cliente> listarClientes();
    public Cliente buscarClientePorId(Integer idCliente);
    public void guardarCliente(Cliente cliente);
    public void eliminarCliente(Cliente cliente);
}
