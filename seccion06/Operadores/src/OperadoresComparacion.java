public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Comparación ***");
        int a = 3, b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // Igualdad ==
        var resultado = a == b; // Primero se realiza la comparación y luego se asigna
        // como son datos primitivos se va a comprar su valor
        // si fuesen objetos el comparador compara la referencia de memoria
        System.out.println("a == b ? " + resultado);

        // Distinto !=
        resultado = a != b;
        System.out.println("a != b ?  " + resultado);

        // Mayor que >
        resultado = a > b;
        System.out.println("a > b ? " + resultado);

        // Mayor que >=
        resultado = a >= b;
        System.out.println("a >= b ? " + resultado);

        // Menor que >
        resultado = a < b;
        System.out.println("a < b ? " + resultado);

        // Menor que >=
        resultado = a <= b;
        System.out.println("a <= b ? " + resultado);


    }
}
