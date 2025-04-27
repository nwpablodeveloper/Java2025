import java.util.Scanner;

public class IntroducirValoresArreglo {
    public static void main(String[] args) {
        // Introducir valores a un arreglo
        var consola = new Scanner(System.in);

        // Declarar el arreglo
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());

        // Creamos de manera dinamica el arreglo
        var arreglo = new int[largoArreglo];

        // Solicitar los valores del arreglo
        for (int i = 0; i < largoArreglo; i++) {
            System.out.print("Proporcone el valor para la posición [" + i + "]: ");
            arreglo[i] = consola.nextInt();
        }

        // Imprimir los valores del arreglo
        System.out.println("\nImpresión del Arreglo");
        for (int i = 0; i < arreglo.length; i++)
            System.out.println("enteros["+ i +"] = " + arreglo[i]);
    }
}
