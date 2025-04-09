import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud y Fitness ***");

        // Constantes
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = 0.04;

        // Pedimos los valores al usuario
        var consola = new Scanner(System.in);
        System.out.print("Nombre de Usuario: ");
        var nombre = consola.nextLine();

        System.out.print("Pasos caminados en el día? ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        // Verificar si el usuario alcanzó la meta de pasos diarios
        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIOS) ? "Si :)" : "No :(";

        // Calculamos las calorias quemadas
        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        // Mostrar la información
        System.out.printf("""
                \nNOmbre del usuario: %s
                Pasos dados hoy: %d
                Calorias Quemadas: %.2f
                Meta de pasos diarios alcanzada: %s
                --------------------------------------------
                La meta de pasos diarios es de: %d
                """, nombre, pasosDiarios, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIOS);
    }
}
