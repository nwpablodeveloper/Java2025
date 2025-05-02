package sistema_ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");

        var producto1 = new Producto("Blusa", 30);
        var producto2 = new Producto("Zapatos", 50);
        var producto3 = new Producto("Campera", 120);
        var producto4 = new Producto("Medias", 8.75);
        var producto5 = new Producto("Remera", 33.50);
        var producto6 = new Producto("Buzo", 48.66);
        var producto7 = new Producto("Gorra", 25.74);
        var producto8 = new Producto("Cadena", 5.32);
        var producto9 = new Producto("Guantes", 11.20);
        var producto10 = new Producto("Saco", 230.61);

        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto8);

        orden1.mostrarOrden();

        System.out.println();
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("reloj", 133));
        orden2.agregarProducto(producto10);
        orden2.agregarProducto(producto9);

        // Usando toString
        System.out.println(orden2);
    }
}
