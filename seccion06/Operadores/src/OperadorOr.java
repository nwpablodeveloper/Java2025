public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("*** Operador Lógico OR ***");
        // El Operador || (OR) regresa verdadero si cualquier valor a comparar es TRUE

        boolean a = true;
        boolean b = false;
        var resultado = a || b;
        System.out.println("resultado = " + resultado);

        a = true;
        b = true;
        resultado = a || b;
        System.out.println("resultado = " + resultado);

        a = false;
        b = true;
        resultado = a || b;
        System.out.println("resultado = " + resultado);

        a = false;
        b = false;
        resultado = a || b;
        System.out.println("resultado = " + resultado);

    }
}
