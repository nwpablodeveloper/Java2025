import java.util.Scanner;

public class RetoAplicacionSaludFitnes {
    public static void main(String[] args) {
        System.out.println("*** Aplicación de Salud y Fitness ***");
        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04;

        var consola = new Scanner(System.in);
        System.out.print("Nombre de Usuario: ");
        var nombre = consola.nextLine();

        System.out.print("Pasos caminados en el día? ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;
        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIO) ? "Se cumplio la meta"
                : "No se cumplio la meta";


        System.out.printf("""
                \nNombre de usuario : %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f
                Meta de pasos: %s pasos
                --------------------------
                Objetivo de pasos: %d
                """, nombre,pasosDiarios, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIO);
    }
}
