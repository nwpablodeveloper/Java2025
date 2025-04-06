import java.util.Scanner;

public class TicketVentaDescuento {
    public static void main(String[] args) {
        System.out.println("*** Generaración Ticket de Venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: $ ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: $ ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: $ ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio plátanos: $ ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algún descuento (%): $ ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // Caluclar subtotal (sin impuestos)
        var subtotal = precioLechuga + precioPan + precioLeche + precioPlatanos;

        // Aplicar Descuento
        var descuento = subtotal * (descuentoPorcentaje / 100.0);

        // Sutbototal con descuento
        var subtotalConDescuento = subtotal - descuento;

        // Cálcular con impuestos (%16)
        var impuestos = subtotalConDescuento * 0.16;

        // Calculo total de la compra (con impuestos)
        var costoTotalCompra = subtotalConDescuento + impuestos;

        // Imprimir ticket de venta
        System.out.printf("""
            %nTicket de venta
            --------------------
            Subtotal: $ %.2f
            Descuento: $%.2f (%d%%)
            Impuesto (16 %%): %.2f
            TOTAL: $ %.2f
            """, subtotal, descuento, descuentoPorcentaje, impuestos, costoTotalCompra);
    }
}

