import java.util.Scanner;

public class RetoCalculadora {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        var salir = false;

        while (!salir){
            System.out.println("*** Calculadora en Java ***");
            System.out.print("""
                    Operaciones permitidas:
                    1. Sumar
                    2. Restar
                    3. Multiplicar
                    4. División
                    5. Salir
                    Escoge una opción:\s""");

            var opcion = consola.nextInt();

            Double operando1 = 0.0, operando2 = 0.0;
            if (opcion >= 1 && opcion <= 4){
                System.out.print("Ingrese el valor del 1er operando: ");
                operando1 = consola.nextDouble();
                System.out.print("Ingrese el valor del 2do operando: ");
                operando2 = consola.nextDouble();
            }

            Double resultado = 0.0;
            switch (opcion){
                case 1 -> resultado =  operando1 + operando2;
                case 2 -> resultado = operando1 - operando2;
                case 3 -> resultado = operando1 * operando2;
                case 4 -> {
                    if (operando2 != 0.0)
                        resultado = operando1 / operando2;
                    else
                        System.out.println("Imposible dividir entre 0");
                }
                case 5 -> {
                    System.out.println("Cerrando la calculadora");
                    salir = true;
                }
                default -> System.out.println("Opción no valida");
            }
            if (operando2 != 0.0)
                System.out.printf("""
                        El resultado de la operación entre %.2f y %.2f es: %.2f%n%n""", operando1, operando2, resultado);
        }
    }
}
