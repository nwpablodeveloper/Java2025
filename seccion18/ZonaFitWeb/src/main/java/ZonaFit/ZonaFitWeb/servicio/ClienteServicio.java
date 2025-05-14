package ZonaFit.ZonaFitWeb.servicio;

import ZonaFit.ZonaFitWeb.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ZonaFit.ZonaFitWeb.repositorio.IClienteRepositorio;

import java.util.List;

@Service
public class ClienteServicio implements IClienteServicio{

    @Autowired
    IClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepositorio.findAll();
    }

    @Override
    public Cliente buscarClientePorId(Integer idCliente) {
        return clienteRepositorio.findById(idCliente).orElse(null);
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRepositorio.save(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRepositorio.delete(cliente);
    }
}
