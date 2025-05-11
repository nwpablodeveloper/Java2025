package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;

import java.util.List;

public interface IClienteServicio {
    public List<Cliente> listarClientes();
    public Cliente buscarClientePorId(Integer idCliente);

    // Guardar o modifcar Cliente, dependemos si al ID del Objeto Cliente que recibamos es Null o Tiene datos
    public void guardarCliente(Cliente cliente);

    public void eliminarCliente(Cliente cliente);
}
