import java.util.Locale;
import java.util.Scanner;

public class RetoRecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");

        var consola = new Scanner(System.in);
        consola.useLocale(Locale.US);

        System.out.print("Nombre de la receta: ");
        var nombreReceta = consola.nextLine();

        System.out.print("Ingrese los ingredientes: ");
        var ingredientes = consola.nextLine();

        System.out.print("Tiempo de preparación: ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa la dificultad: ");
        var dificultad = consola.nextLine();

        System.out.println("\n--- Receta de Cocina");
        System.out.println("Nombre receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo preparación: " + tiempoPreparacion);
        System.out.println("Dificultad: " + dificultad);

    }
}
