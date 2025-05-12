package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;

import java.util.List;

public interface IClienteServicio {
    public List<Cliente> listarClientes();
    public Cliente buscarClientes(Integer idCliente);
    public void guardarClientes(Cliente cliente);
    public void eliminarCliente(Cliente cliente);
}
