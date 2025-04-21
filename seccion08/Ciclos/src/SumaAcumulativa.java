public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma Acumulativa ***");

        var acumuladorFor = 0;
        for (int i = 1; i < 6; i++) {
            acumuladorFor += i;
        }
        System.out.println("acumuladorFor = " + acumuladorFor);

        final var MAXIMO  = 5;
        var acumladorWhile = 0;

        var numero = 1;
        while (numero <= MAXIMO){
            System.out.printf("%n Lo que se va a sumar es: %d + %d = %d"
                    , acumladorWhile, numero, (acumladorWhile + numero));

            acumladorWhile += numero++;
        }

        System.out.println("\nacumladorWhile = " + acumladorWhile);
    }
}
