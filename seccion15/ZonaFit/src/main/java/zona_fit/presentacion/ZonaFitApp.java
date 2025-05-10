package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;

import java.util.Scanner;

public class ZonaFitApp {
    public static void main(String[] args) {
        zonaFitApp();
    }

    private static void zonaFitApp(){
        var salir = false;
        var consola = new Scanner(System.in);
        // Creamos un objeto de la clase clienteDAO
        var clienteDAO = new ClienteDAO();

        while (!salir){
            try {
                mostrarMenu();
                //salir = ejecutarOpciones(consola, clienteDAO);
            } catch (Exception e) {
                System.out.println("Error al mostrar las opciones");
            }
        }
    }

    private static void mostrarMenu(){
        System.out.print("""
                *** Zona Fit (GYM) ***
                1. Listar Clientes
                2. Buscar Cliente
                3. Agregar Cliente
                4. Modificar Cliente
                5. Eliminar Cliente
                6. Salir
                Elige una opción:\s""");
    }
}
