package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class RetoZonaFitApp {

    public static void main(String[] args) {
        zonaFit();
    }

    public static void zonaFit(){
        IClienteDAO clienteDAO = new ClienteDAO();
        boolean salir = false;
        Scanner consola = new Scanner(System.in);

        while (!salir){
            try{
                int opcion = mostrarMenu(consola);
                salir = ejectuarOpcion(opcion, consola, clienteDAO);
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
                e.printStackTrace();
            }finally {
                System.out.println();
            }
        }
        System.out.println("Cerrando App...");
    }

    public static boolean ejectuarOpcion(int opcion, Scanner consola, IClienteDAO clienteDAO){

        switch (opcion){
            case 1 -> listarClientes(clienteDAO);
            case 2 -> agregarCliente(consola, clienteDAO);
            case 3 -> modifcarCliente(consola, clienteDAO);
            case 4 -> eliminarCliente(consola, clienteDAO);
            case 5 -> {
                System.out.println("Saliendo...");
                return true;
            }
            default -> System.out.println("Opción no valida");
        }
        return false;
    }

    public static void listarClientes(IClienteDAO clienteDAO){
        clienteDAO.listarClientes().forEach(System.out::println);
    }

    public static void agregarCliente(Scanner consola, IClienteDAO clienteDAO){
        Cliente cliente = new Cliente();
        if(clienteDAO.agregarCliente(datosCliente(consola, cliente)))
            System.out.println("Se agrego el cliente");

    }

    public static void modifcarCliente(Scanner consola, IClienteDAO clienteDAO){
        Cliente cliente = new Cliente();
        System.out.print("Id del cliente a modificar? ");
        cliente.setId(Integer.parseInt(consola.nextLine()));
        if (clienteDAO.modificarCliente(datosCliente(consola, cliente)))
            System.out.println("Se modifico el cliente");
    }

    public static void eliminarCliente(Scanner consola, IClienteDAO clienteDAO){
        System.out.print("ID del cliente a eliminar: ");
        if (clienteDAO.eliminarCliente(new Cliente(Integer.parseInt(consola.nextLine()))))
            System.out.println("Se elimino el cliente de");
    }

    public static int mostrarMenu(Scanner consola){
        System.out.print("""
                Menú:
                1. Ver lista de Clientes
                2. Agregar un nuevo Cliente
                3. Modifiar un Cliente
                4. Eliminar un Cliente
                5. Salir
                Elige una opción:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    private static Cliente datosCliente(Scanner consola, Cliente cliente){
        System.out.print("Nombre del cliente: ");
        cliente.setNombre(consola.nextLine());
        System.out.print("Apellido del cliente: ");
        cliente.setApellido(consola.nextLine());
        System.out.print("Membresia del cliente: ");
        cliente.setMembresia(Integer.parseInt(consola.nextLine()));
        return cliente;
    }
}
