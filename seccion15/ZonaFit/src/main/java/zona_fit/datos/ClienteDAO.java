package zona_fit.datos;

import zona_fit.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static zona_fit.conexion.Conexion.getConexion;

public class ClienteDAO implements IClienteDAO{

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();

        // para preparar la SQL
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion(); // Importación estatic, arriba esta el import
        var sql = "SELECT * FROM cliente ORDER BY id";

        try{
            ps = con.prepareStatement(sql);

            // rs - ResultSet nos permite acceder a cada una de las columnas de la tabla
            rs = ps.executeQuery();

            // Iterar de registro en registro
            while (rs.next()){
                var cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));

                clientes.add(cliente);
            }

        } catch (SQLException e) {
            System.out.println("Error al listar los clientes: " + e.getMessage());
        }finally {
            try{
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }


        return clientes;
    }

    @Override
    public boolean buscarClientePorId(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        var sql = "SELECT * FROM cliente WHERE id = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId()); // 1 de 1 parametro que se va a enviar
            rs = ps.executeQuery();
            if(rs.next()){
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar el cliente por ID");
        }finally {
            try{
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "INSERT INTO cliente (nombre, apellido, membresia ) "
                    + "VALUES (?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar el cliente a la DB: " + e.getMessage());
        }finally {
            try{
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }

        return false;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        return false;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        return false;
    }

    @Override
    public void imprimir(){
        listarClientes().forEach(System.out::println);
    }

    public static void main(String[] args) {
        IClienteDAO clienteDAO = new ClienteDAO();

        // Listar Clientes
        System.out.println("*** Listado de Clientes ***");

//        var clienteDAO = new ClienteDAO();
//        List<Cliente> clientes = clienteDAO.listarClientes();
//
//        clienteDAO.listarClientes().forEach(System.out::println);

        // Refactorizado
//        clienteDAO.listarClientes().forEach(System.out::println);
        clienteDAO.imprimir();

        // Buscar cliente por ID
        System.out.println("\nBuscar Clientes por ID");
        Cliente cliente = new Cliente(1);
        if(clienteDAO.buscarClientePorId(cliente))
            System.out.println("Cliente encontrado\n"+cliente);
        else
            System.out.println("No se encontro el cliente");

        // Agregar Cliente
        System.out.println("\nAgregar Clientes");
        var agregado = clienteDAO.agregarCliente(new Cliente("Sophia", "Veiga", 289));
        System.out.println("agregado = " + agregado);
        if (agregado) {
            System.out.println("El cliente fue agregado exitosamente");
            clienteDAO.imprimir();
        }
        else
            System.out.println("Error");


    }

}
