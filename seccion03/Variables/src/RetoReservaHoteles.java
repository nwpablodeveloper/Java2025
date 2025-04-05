public class RetoReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Reto reserva de hoteles ***");
        var nombreCliente = "Pablo Veiga";
        var diasEstancia = 10;
        final var TARIFA_DIARIA = 89.90;
        var tieneVistaAlMar = false;
        
        // Imprimir variables
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("TARIFA_DIARIA = " + TARIFA_DIARIA);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);

        // Asignar nuevos valores
        diasEstancia = 12;
        tieneVistaAlMar = true;

        // Imprimir variables
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("TARIFA_DIARIA = " + TARIFA_DIARIA);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);

    }
}
