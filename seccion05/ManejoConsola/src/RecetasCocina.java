import java.util.Locale;
import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de Cocina ***");

        var consola = new Scanner(System.in);
        consola.useLocale(Locale.US);

        // Nombre de la receta
        System.out.print("Ingresa el nombre de la receta: ");
        var nombreReceta = consola.nextLine();

        // Ingredientes
        System.out.print("Ingresa los Ingredientes: ");
        var ingredientes = consola.nextLine();

        // Tiempo de preparación
        System.out.print("Ingresa el tiempo de preparación en minutos: ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // Dificultad de la preparación
        System.out.print("Ingresa la dificultad (Fácil/Medio/Dificil: ");
        var dificultadPreparacion = consola.nextLine();

        // Imprimir los valores de la receta
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre receta: " + nombreReceta);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tTiempo de preparación: " + tiempoPreparacion);
        System.out.println("\tDificultad: " + dificultadPreparacion);

    }
}
