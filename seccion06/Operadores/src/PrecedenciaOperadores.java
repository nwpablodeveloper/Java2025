public class PrecedenciaOperadores {
    public static void main(String[] args) {
        // Precedencia de Operadores
        // 1. Parentesis y Corchetes
        // 2. Operadores Unarios -, ++, --
        // 3. Operadores Aritmeticos *, / y %
        // 4. Operadores Aritmeticos + y -
        // 5. Relacionales <, <=, >, >=
        // 6. Equivalencia == y !=
        // 7. Lógicos && y ||
        // 8. Asignación =, +=, -=, *=, /=, etc.
        
        // Expresión

        // Lee de Izquierda a derecha y por ultimo se asigna su resultado a la variable
        var a = 12 / 3 + 2 * 3 - 1;
        // 1ro División de 12 / 3 = 4
        // 2do Multiplicación de 2 * 3 = 6
        // 3ro Suma 4 + 6  = 10
        // 4to resta 10 - 1
        System.out.println("a = " + a);

        // Lee de Izquierda a derecha y por ultimo se asigna su resultado a la variable
        // Prioridad los parentesis
        var b = 12 / 3 + 2 * (3 - 1);
        // 1ro Resta de 3 - 1 = 2
        // 2do División de 12 / 3 = 4
        // 3ro Multiplicación de 2 * 2 = 4
        // 4to suma de 4 + 4 = 8
        System.out.println("b = " + b);

    }
}
