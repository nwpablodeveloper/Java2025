import java.util.Scanner;

public class RetoDibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibujar una piramide de ateriscos ***");

        var consola = new Scanner(System.in);
        System.out.print("De cuantas filas va a ser la piramide? ");
        var numerosFilas = consola.nextInt();

        // Iteramos sobre cada fila del triangúlo
        for (int fila = 1; fila <= numerosFilas; fila++) {
            var espaciosBlancos = " ".repeat(numerosFilas - fila);
            var ateriscos = "*".repeat(2 * fila - 1);
            System.out.println( espaciosBlancos + "/" + ateriscos + "\\");

        }
        var base = "-".repeat(2 * numerosFilas - 1);
        System.out.println(" " + base);
    }
}
