import java.util.Locale;
import java.util.Scanner;

public class ConversionTiposDeDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        // Leer un tipo int
        var consola = new Scanner(System.in);
        consola.useLocale(Locale.US); // Forzar el uso del punto "." al ingresar los datos

        // Conversión de datos
        System.out.print("Proporciona un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString); // Convertir a Integer
        System.out.println("entero = " + entero);

        // Convertir a Float
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

        /*
        Double.parseDouble();
        Float.parseFloat();
        Boolean.parseBoolean();
        */

    }
}
