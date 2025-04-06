import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema Préstamo de Libros ***");
        
        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("Cuentas con credencial de estudiante? ");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuantos km vives de la biblioteca? ");
        var distanciaBibilotecaKm = Integer.parseInt(consola.nextLine());
        
        var esElegiblePrestamo = tienesCredencial && distanciaBibilotecaKm <= DISTANCIA_PERMITIDA_KM;
        System.out.println("Eres elegible para el prestamos de libros? = " + esElegiblePrestamo);
    }
}
