public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");
        // Sintaxis
        // condicion ? exp1 : exp2

        // Determinar si un nro. es par o no
        var numero = 4;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("numero = " + numero + " Es: " + resultado );

        // Calcular si es mayour de edad
        var edad = 17;
        var mensaje = (edad >= 18) ? "Eres mayor de edad" : "Eres menor de edad";
        System.out.println("edad = " + edad + ", " + mensaje);

        // Valor positivo, negativo o cero
        numero = -10;
        mensaje = (numero > 0) ? "positivo":
                (numero < 0) ? "negativo" : "cero";
        System.out.println("numero = " + numero + " es: " + mensaje);
    }
}
