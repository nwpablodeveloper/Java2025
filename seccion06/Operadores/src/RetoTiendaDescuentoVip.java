import java.util.Scanner;

public class RetoTiendaDescuentoVip {
    public static void main(String[] args) {
        System.out.println("*** Tienda de descuento VIP ***");

        var consola = new Scanner(System.in);

        final var LIMITE = 10;

        System.out.print("Cuantos productos ha comprado? ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tiene membresia (true/false)? ");
        var membresia = Boolean.parseBoolean(consola.nextLine());

        var descuentoVip = cantidadProductos >= LIMITE && membresia;
        System.out.println("Su acceso a descuento VIP es: " + descuentoVip);

    }
}
