import java.util.Scanner;

public class RetoPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema Préstamo de Libros ***");

        var consola = new Scanner(System.in);
        final var MAXIMO_KILOMETROS = 3F;
        
        System.out.print("Tiene credencial (true/false)? ");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuantos kilometros vives de la biblioteca? ");
        var kilometros = Double.parseDouble(consola.nextLine());
        
        var prestarLibre = tieneCredencial && kilometros <= MAXIMO_KILOMETROS;
        System.out.println("prestarLibre = " + prestarLibre);
        
    }
}
