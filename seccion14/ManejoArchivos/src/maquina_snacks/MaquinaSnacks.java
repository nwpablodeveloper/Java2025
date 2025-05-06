package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {

    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        boolean salir = false;
        Scanner consola = new Scanner(System.in);

        // Creamos la lsita de productos de tipo Snack
        List<Snack> productos = new ArrayList<>();

        System.out.println("*** Maquina de Snacks ***");

        // Mostrar el inventario de Snacks disponibles
        Snacks.mostrarSnacks();

        while (!salir){
            try{
                int opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e);
            }finally {
                System.out.println();
            }
        }
        System.out.println("Cerrando app");
    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
            Menú:
            1. comparar Snack
            2. Mostrar Ticket
            3. Agregar Nuevo Snack
            4. Salir
            Elige una opción:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos){
        var salir = false;

        switch (opcion){
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.print("Saliendo...");
                salir = true;
            }
            default -> {
                System.out.println("Opcion no valida");
            }
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos){

        System.out.print("Que snack quiere comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine());

        // Validar que el snack exista en la lista de snacks
        var snackEncontrado = false;

        for (Snack snack : Snacks.getSnacks()){
            if (idSnack == snack.getIdSnack()){
                // Agregamos el Sncka a la lista de productos
                productos.add(snack);
                System.out.println("\tOk, Snack Agregado:\n\t" + snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado){
            System.out.println("Id de Snack no valido: " + idSnack);
        }
    }

    private static void mostrarTicket(List<Snack> productos){

        String ticket = "*** Ticket de Venta ***";
        double total = 0.0;

        for (Snack producto : productos){
            ticket += "\n\t- " + producto.getNombre() + " - $ " + producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal -> $ " + total;
        System.out.println(ticket);

    }

    private static void agregarSnack(Scanner consola){
        System.out.print("Nombre del nuevo Snack? ");
        String nombre = consola.nextLine();

        System.out.print("Precio del nuevo Snack? ");
        double precio = Double.parseDouble(consola.nextLine());

        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu snack fue agregado exitosamente");
        Snacks.mostrarSnacks();
    }
}

