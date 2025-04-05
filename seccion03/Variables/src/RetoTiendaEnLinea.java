public class RetoTiendaEnLinea {
    public static void main(String[] args) {
        String nombreProducto = "Monitor";
        double precio = 175.3;
        int stock = 10;
        boolean isVenta = true;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("stock = " + stock);
        System.out.println("isVenta = " + isVenta);

        nombreProducto = "Mouse";
        precio = 13.3;
        stock =  5;
        isVenta = false;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("stock = " + stock);
        System.out.println("isVenta = " + isVenta);
    }
}
