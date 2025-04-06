public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador AND ***");
        boolean a = true, b = false;

        // AND (regresa verdadero unicamente si los 2 valores son TRUE,
        var resultado = a && b; // Se necesitan 2 operandos para realizar la operacion
        System.out.println("resultado = " + resultado);

        a = false;
        b = true;
        resultado = a && b;
        System.out.println("resultado = " + resultado);

        a = false;
        b = false;
        resultado = a && b;
        System.out.println("resultado = " + resultado);

        a = true;
        b = true;
        resultado = a && b;
        System.out.println("resultado = " + resultado);

    }
}
