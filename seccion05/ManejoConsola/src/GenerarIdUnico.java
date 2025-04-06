import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GenerarIdUnico {
    public static void main(String[] args) {
        System.out.println("*** Sistema Generador de ID Único ***");
        var consola = new Scanner(System.in);
        consola.useLocale(Locale.US);
        var aleatorio = new Random();

        // Solicitar el nombre de usuario
        System.out.print("Cuál es tu nombre?: ");
        var nombre = consola.nextLine();

        // Solicitar el apellido
        System.out.print("Cuál es tu apellido?: ");
        var apellido = consola.nextLine();

        // Solicitar el año de nacimiento
        System.out.print("Cuál es tu año de nacimiento?: ");
        var anioNacimiento = consola.nextLine();

        // Normalizar los valores
        var nombre2 = nombre.trim().toUpperCase().substring(0,2);
        var apellido2 = apellido.trim().toUpperCase().substring(0,2);
        var anioNacmiento2 = anioNacimiento.trim().substring(2);

        // Generar valor aleatorio entre 1 y 9999
        var numeroAleatorio = aleatorio.nextInt(9999) + 1;

        // Formato de 4 digitos
        var numeroAleatorioFormato = String.format("%04d", numeroAleatorio);

        // Generar ID Único
        var idUnico = nombre2 + apellido2 + anioNacmiento2 + numeroAleatorioFormato;

        // Imprimir el ID Único
        System.out.printf("""
                %nHola %s
                \tTu nuevo número de identificación (ID) generado por el sistema es:
                \t%s
                \tFelicidades!
                """,nombre, idUnico);


    }
}
