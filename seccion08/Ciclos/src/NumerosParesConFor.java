public class NumerosParesConFor {
    public static void main(String[] args) {
        System.out.println("*** Números pares del 1 al 20 con Ciclo For ***");
        
        for (var i = 1; i <= 20; i++){
            if (i %2 == 0)
                System.out.print(i + " ");
        }
    }
}
