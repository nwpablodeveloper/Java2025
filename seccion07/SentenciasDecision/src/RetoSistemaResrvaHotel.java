import java.util.Scanner;

public class RetoSistemaResrvaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hotel ***");

        final var CUARTO_CON_VISTA_MAR = 190.50;
        final var CUARTO_SIN_VISTA_MAR = 150.50;

        var consola = new Scanner(System.in);

        System.out.print("Nombre de Cliente: ");
        var nombreCliente = consola.nextLine();

        System.out.print("Días de estadia en el hotel: ");
        var diasDeEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("Cuarto con vista al mar? ");
        var cuartoConVistaMar = Boolean.parseBoolean(consola.nextLine());

        var costoTotal = 0.0;
        if (cuartoConVistaMar)
            costoTotal = diasDeEstadia * CUARTO_CON_VISTA_MAR;
        else
            costoTotal = diasDeEstadia * CUARTO_SIN_VISTA_MAR;


        var mensaje = cuartoConVistaMar ? "Si :)" : "No :(";


        System.out.printf("""
                \n-------- Detalles de la Reservación --------
                Cliente: %s
                Días de estadia: %d
                Costo total: %.2f
                Habitación con vista al mar: %s
                """,nombreCliente, diasDeEstadia, costoTotal, mensaje);


    }
}
