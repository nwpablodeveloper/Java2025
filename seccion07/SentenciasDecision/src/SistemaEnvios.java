import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos***");

        final var TARFIA_NACIONAL = 10.0;
        final var TARIFA_INTERNACIONAL = 20.0;

        var consola = new Scanner(System.in);

        System.out.print("El destino es Nacional o Internacional? ");
        var destino = consola.nextLine().toLowerCase().strip();

        System.out.print("Peso del paquete? ");
        var peso = Double.parseDouble(consola.nextLine());

        var costoEnvio = switch (destino){
            case "nacional" -> peso * TARFIA_NACIONAL;
            case "internacional" -> peso * TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino no valido");
                yield null; // Retornar un valor de forma forzada
            }
        };

        if (costoEnvio != null){
            System.out.printf("El costo de envío del paquete es: $ %.2f", costoEnvio);
        }

    }
}
