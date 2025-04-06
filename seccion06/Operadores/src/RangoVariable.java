import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        System.out.println("*** Rango de una Variable con NOT ***");
        var consola = new Scanner(System.in);

        System.out.print("Proporciona un dato entero: ");
        var dato = Integer.parseInt(consola.nextLine());
        
        // Revisar si esta dentro de rango (entre 1 y 10)
        var estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("estaDentroRango = " + estaDentroRango);

        // Revisar logica inversa, si el dato esta fuera de rango
        var estaFueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("estaFueraRango = " + estaFueraRango);
    }
}
