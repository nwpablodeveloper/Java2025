import java.util.Scanner;

public class RetoTicketVenta {
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

        // Caluclar subtotal (sin impuestos)
        var subtotal = precioLechuga + precioPan + precioLeche + precioPlatanos;

        // Cálcular con impuestos (%16)
        var impuestos = subtotal * 0.16;

        // Calculo total de la compra (con impuestos)
        var costoTotalCompra = subtotal + impuestos;

        // Imprimir ticket de venta
        System.out.printf("""
                %nTicket de venta
                --------------------
                Subtotal: $ %.2f
                Impuesto (16 %%): %.2f
                TOTAL: $ %.2f
                """, subtotal, impuestos, costoTotalCompra);
    }
}
