import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Línea con Descuentos ***");

        // Condiciones
        final var MONTO_COMPRA_DESC = 1000;

        var consola = new Scanner(System.in);

        System.out.print("Cuál fue el monto de tu compra: ");
        var montoCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Eres miembre de la tienda (true/false): ");
        var eresMiembre = Boolean.parseBoolean(consola.nextLine());

        // Calculamos el descuento
        var descuento = 0.0;
        // Verificamos cada caso, con los datos proporcionados
        if (montoCompra >= MONTO_COMPRA_DESC && eresMiembre) {
            descuento = 0.1; // Descuento del 10%
        } else if (eresMiembre) {
            descuento = 0.05; // Descuento del 5%
        }else {
            descuento = 0;
        }

        // Hacemos los calculos respectivos para obtener el descuento.
        if (descuento != 0) {
            var montoDescuento = montoCompra * descuento;
            var montoFinal = montoCompra - montoDescuento;
            System.out.printf("""
                    %nFelicidades!, has obtenido un descuento del: %.0f%%
                    Monto de la compra: $ %.2f
                    Monto del descuento: $ %.2f
                    El monto final de la compra con descuento: $ %.2f
                    """,descuento * 100, montoCompra, montoDescuento, montoFinal );
        }else {
            System.out.printf("""
                    %nNo obtuviste ningun tipo de descuento
                    Te invitamos a hacerte miembro de la tienda.
                    Monto final de la compra: $ %.2f
                    """,montoCompra);
        }

    }
}
