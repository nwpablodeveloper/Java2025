import java.util.Locale;
import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        // Leer un tipo int
        var consola = new Scanner(System.in);
        consola.useLocale(Locale.US); // Forzar el uso del punto "." al ingresar los datos

        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        // Leer un tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        
        /*
            Los metodos nextInt(), nextDouble, etc. No conusmen el caracter de salto de linea
            Si pasamos a usar un consola.nextLine(); va a consumir automaticamente el caracter de salto de línea
            que no consumieron anteriormete y va dar por hecho la operación
         */
        
        /*var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre); // Aca vamos a notar el error mensionado anteriormente*/

        consola.nextLine(); // consumir caracter de salto de linea antes de leer una linea completa

        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

    }
}
