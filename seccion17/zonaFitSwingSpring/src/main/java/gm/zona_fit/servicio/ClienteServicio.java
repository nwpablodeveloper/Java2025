package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.repositorio.IClienteRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio implements IClienteServicio{

    IClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepositorio.findAll();
    }

    @Override
    public Cliente buscarClientes(Integer idCliente) {
        return clienteRepositorio.findById(idCliente).orElse(null);
    }

    @Override
    public void guardarClientes(Cliente cliente) {
        clienteRepositorio.save(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRepositorio.delete(cliente);
    }
}
