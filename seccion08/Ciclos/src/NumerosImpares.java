public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("*** Números Impares del 0 al 20 ***");

        var contador = 0;

        while (contador <= 20){
            if (contador % 2 != 0)
                System.out.printf("%n%d \tes impar", contador);
            contador++;
        }

        System.out.println("\n\nCon Do-While");
        contador = 0;
        do{
            if (contador %2 !=0)
                System.out.printf("%n%d\t Es Impar", contador);
            contador++;
        }while (contador <= 20);

    }
}
