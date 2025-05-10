package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;

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
        }

        return false;
    }
}
