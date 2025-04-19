import java.util.Scanner;

public class RetoElMayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** Reto el mayor de 2 números ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese el 1er número: ");
        var nro1 = Double.parseDouble(consola.nextLine());

        System.out.print("Ingrese el 2do número: ");
        var nro2 = Double.parseDouble(consola.nextLine());

        var mensaje = nro1 > nro2 ? "Nro1 es mayor" :
                nro1 == nro2 ? "Son iguales":
                        "Nro2 es el mayor";
        System.out.println("mensaje = " + mensaje);

    }
}
