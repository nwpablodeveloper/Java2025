package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class ZonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();
    }

    private static void zonaFitApp(){
        var salir = false;
        var consola = new Scanner(System.in);
        // Creamos un objeto de la clase clienteDAO
        IClienteDAO clienteDAO = new ClienteDAO();

        while (!salir){
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(consola, opcion, clienteDAO);
            } catch (Exception e) {
                System.out.println("Error al mostrar las opciones");
            }finally {
                System.out.println();
            }
        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                *** Zona Fit (GYM) ***
                1. Listar Clientes
                2. Buscar Cliente
                3. Agregar Cliente
                4. Modificar Cliente
                5. Eliminar Cliente
                6. Salir
                Elige una opción:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(Scanner consola, int opcion, IClienteDAO clienteDAO){
        switch (opcion){
            case 1 -> { // Listar clientes
                System.out.println("--- Listado de Clientes---");
                var clientes = clienteDAO.listarClientes();
                clientes.forEach(System.out::println);
            }
            case 2 -> { // Buscar cliente por id
                System.out.print("Introduce el ID del cliente a buscar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var encontrado = clienteDAO.buscarClientePorId(cliente);
                if (encontrado)
                    System.out.println("Cliente encontrado: " + cliente);
                else
                    System.out.println("Cliente no encontrado: " + cliente);
            }
            case 3-> { // Agregar Cliente
                System.out.println("--- Agregar Cliente ---");
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());
                // Creamos el objeto
                var cliente = new Cliente(nombre, apellido, membresia);
                var agregado = clienteDAO.agregarCliente(cliente);
                if (agregado)
                    System.out.println("Cliente agregado: " + cliente);
                else
                    System.out.println("Cliente no agregado: " + cliente);

            }
            case 4 -> { // Modificar Cliente
                System.out.println("--- Modificar Clientes ---");
                System.out.print("ID Clientes: ");
                var idClientes = Integer.parseInt(consola.nextLine());
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());

                // Creamos el objeto a modificar
                var cliente = new Cliente(idClientes,nombre,apellido,membresia);
                var modificado = clienteDAO.modificarCliente(cliente);
                if (modificado)
                    System.out.println("Cliente modificado: " + cliente);
                else
                    System.out.println("Cliente no modificado: " + cliente);

            }
            case 5 -> { // Eliminar Cliente
                System.out.println("--- Eliminar Clientes ---");
                System.out.print("Id de Cliente? ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var eliminado = clienteDAO.eliminarCliente(cliente);
                if (eliminado)
                    System.out.println("Cliente eliminado: " + cliente);
                else
                    System.out.println("Cliente no eliminado: " + cliente);
            }
            case 6 -> { // Salir del sistema
                System.out.println("Hasta pronto");
                return true;
            }
            default -> System.out.println("Opción no valida: " + opcion);
        }

        return false;
    }
}
