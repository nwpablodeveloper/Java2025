import java.util.Scanner;

public class TiendaEnLineaConDescuento {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Línea con Descuento ***");

        var consola = new Scanner(System.in);

        System.out.print("Cuál fue el monto de tu compra? ");
        var montoCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Eres miembro de la tienda (true/false)? ");
        var esMiembro = Boolean.parseBoolean(consola.nextLine());

        if (montoCompra >= 1500 && esMiembro){
            var montoDescuento = montoCompra * 0.10;
            var montoFinal = montoCompra - montoDescuento;
            System.out.printf("""
                    \nFelicidades, has obtenido un descuento del 10%%.
                    Monto final de la compra: $ %.2f
                    Monto del descuento: $ %.2f
                    Monto final de la compra con descuento: $ %.2f 
                    """, montoCompra, montoDescuento, montoFinal );
        }else if (esMiembro){
            var montoDescuento = montoCompra * 0.05;
            var montoFinal = montoCompra - montoDescuento;
            System.out.printf("""
                    \nFelicidades, has obtenido un descuento del 5%%
                    Monto final de la compra: $ %.2f
                    Monto del descuento: $ %.2f
                    Monto final de la compra con descuento: $ %.2f
                    """, montoCompra, montoDescuento, montoFinal);
        }else{
            System.out.printf("""
                    \nNo obtuviste ningún tipo de descuento
                    Te invitamos a hacerte miembro de la tienda
                    Monto final de la compra: $ %.2f
                    """,montoCompra);
        }
    }
}
