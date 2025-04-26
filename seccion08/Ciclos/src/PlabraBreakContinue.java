public class PlabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y Continue ***");

        // Ejemplo break, imprimir solo el 1er número par
        for (int numero = 1; numero < 10; numero++) {
            if (numero % 2 == 0) {
                System.out.println("Se econtro el 1er número par: " + numero);
                break;
            }
        }

        // Ejemplo con CONTINUE, Imprimir solo numeros pares, ignorar impares
        System.out.println("\nPlabra Continue");
        for (int numero = 0; numero < 10; numero++) {
            if (numero % 2!= 0){
                continue;
            }
            System.out.print(numero + " ");
        }
    }
}
