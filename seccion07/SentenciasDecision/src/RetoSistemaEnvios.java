import java.util.Scanner;

public class RetoSistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Reto, Sistema de Envíos***");

        final double TARFIA_NACIONAL = 10;
        final double TARIFA_INTERNACIONAL = 20;

        var consola = new Scanner(System.in);

        System.out.print("El destino es Nacional o Internacional? ");
        var destino = consola.nextLine().toLowerCase().strip();

        System.out.print("Peso del paquete? ");
        var peso = Double.parseDouble(consola.nextLine());

        var costo = 0.0;
        if (destino.equals("nacional"))
            costo = TARFIA_NACIONAL * peso;
        else if (destino.equals("internacional"))
            costo = TARIFA_INTERNACIONAL * peso;
        else
            System.out.println("Destino no valido");

        System.out.print("El costo del envio es: " + costo);
    }
}
