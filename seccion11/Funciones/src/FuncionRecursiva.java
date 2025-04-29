public class FuncionRecursiva {
    // Imprimir 1 al 5 usando una función recursiva

    static void funcionRecursiva(int numero){
        if (numero == 1)
            System.out.println(numero + " ");
        else {
            // Caso recursivo
            funcionRecursiva(numero-1);
            System.out.println(numero + " ");
        }

    }

    public static void main(String[] args) {
       funcionRecursiva(5);
    }
}
