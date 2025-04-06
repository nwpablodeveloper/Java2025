import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RetoGenerarIdUnico {
    public static void main(String[] args) {
        System.out.println("*** Sistema Generador de ID Único");

        var consola = new Scanner(System.in);
        consola.useLocale(Locale.US);

        var random = new Random();
        var numeroAleatorio = random.nextInt(9999) + 1;

        System.out.print("Cuál es tu nombre?:  ");
        var nombre = consola.nextLine();
        var nombre2 = nombre.strip().toUpperCase().substring(0,2);

        System.out.print("Cuál es tu apellido?:  ");
        var apellido = consola.nextLine();
        var apellido2 = apellido.strip().toUpperCase().substring(0,2);

        System.out.print("Cuál es tu año de nacimiento (YYYY)?:  ");
        var anioNacimiento = consola.nextLine().strip().substring(2);

        var nombreCompleto = nombre + " " + apellido;
        var idUnico = nombre2 + apellido2 + anioNacimiento + numeroAleatorio;

        System.out.printf("""
                %nHola %s
                \tTu nuevo número de identificación (ID) generado por el sistema es:
                \t%s
                \tFelicidades!
                """, nombreCompleto, idUnico);
        
    }
}
