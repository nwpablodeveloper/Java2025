package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);

        // Creamos la lsita de productos de tipo Snack
        List<Snack> productos = new ArrayList<>();

        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnacks(); // Mostrar el inventario de Snacks disponibles

        while (!salir){
            try{
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e);
            }finally {
                System.out.println();
            }
        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
            Menú:
            1. comparar Snack
            2. Mostrar Ticket
            3. Agregar Nuevo Sncak
            4. Salir
            Elige una opción:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    public static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos){
        return false;
    }
}

