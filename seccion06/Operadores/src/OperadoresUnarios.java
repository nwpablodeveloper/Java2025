public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        var c = true;

        // Operador unario +
        resultado = +a; // Si el valor es positivo no es necesario indicarlo
        System.out.println("resultado +a = " + resultado);

        // Operador unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        // Operador unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        // Operadores Unarios de incremento/decremento
        // Pre-incremento
        a = 3;
        resultado = ++a; // primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a = " + a);
        
        // Pos-incremento
        a = 3;
        resultado = a++; // Primero se usa el valor y luego se incrementa
        System.out.println("resultado a++= " + resultado);
        System.out.println("en este momento se incrementa -> a = " + a);

        // Pre-decremento
        b = -2;
        resultado = --b;
        System.out.println("resultado --b = " + resultado);
        System.out.println("b = " + b);

        // Pos-decremento
        b = -2;
        resultado = b--;
        System.out.println("resultado b-- = " + resultado);
        System.out.println("b = " + b);

    }
}
