import java.util.Random;
import java.util.Scanner;

public class RetoJuegoAdivinanza {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivinanza ***");

        var consola = new Scanner(System.in);
        final var NUMERO_SECRETO = new Random().nextInt(50) + 1;
        final var INTENTOS_MAXIMOS = 10;
        var intentos = 0;
        var nroAdivinar = 0;

        while (NUMERO_SECRETO != nroAdivinar && INTENTOS_MAXIMOS > intentos){
            intentos++;

            System.out.print("Adivina el número entre 1 y 50: ");
            nroAdivinar = consola.nextInt();

            if (NUMERO_SECRETO > nroAdivinar)
                System.out.println("Pista, el número secreto es mayor");
            else
                System.out.println("Pista, el número secreto es menor");

        }

        if (INTENTOS_MAXIMOS == intentos)
            System.out.println("Se te acabaro los intentos");
        else
            System.out.printf("""
                            Felicidades el tu número %d coincide con el número secreto que es: %d
                            Logrado en %d intentos%n""",
                    nroAdivinar, NUMERO_SECRETO, intentos);

        System.out.println("Fin del juego");

    }
}
