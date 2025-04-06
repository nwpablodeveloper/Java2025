import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor Dentro Rango ***");

        // Definir los limites
        final var MINIMO = 0;
        final var MAXIMO = 5;

        // Solicitar un valro entre 0 y 5
        System.out.print("Ingrese un valor entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        
        // Verificar si el dato esta dentro del rango
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;

        System.out.println("estaDentroRango = " + estaDentroRango);
    }
}
