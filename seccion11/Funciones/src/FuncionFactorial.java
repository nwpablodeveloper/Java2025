public class FuncionFactorial {
    //  Calcular el factorial de un número entero positivo usando recursividad.
    // Ejemplo: factorial(5) = 5 * 4 * 3 * 2 * 1 = 120

    static int factorial(int numero){
        if (numero <= 1)
            return 1;
        else {
            // Caso recursivo
            return factorial(numero - 1) * numero;
        }
    }

    public static void main(String[] args) {
        System.out.println("factorial de 5 es:  " + factorial(5)) ;
    }
}
