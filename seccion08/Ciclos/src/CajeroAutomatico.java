import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var saldo = 1000.0;
        var salir = false;
        // Menú de la App
        while (!salir){
            System.out.print("""
                    *** App de cajero Automático ***
                    Operaciones que puedes realizar.
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Esege una opción:\s""");
            var opcion = consola.nextInt();
            // Procesar cada caso
            switch (opcion){
                case 1 -> System.out.printf("Tu saldo actual es: $ %.2f%n%n", saldo);
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    var retiro = consola.nextDouble();
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.printf("Tu nuevo saldo es: $ %.2f%n%n", saldo);
                    } else
                        System.out.printf("""
                                No cuentas con el saldo suficiente.
                                Saldo actual es: $ %.2f%n%n""", saldo);
                }
                case 3 -> {
                    System.out.print("Ingrese el monto a depositar: ");
                    var deposito = consola.nextDouble();
                    saldo += deposito;
                    System.out.printf("Su saldo actual es de: $ %.2f%n%n", saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero automático");
                    salir = true;
                }
                default -> System.out.println("Opción no valida" +
                        "Seleccione otra opcion:\n");
            }
        }
        System.out.println("Hasta pronto");
    }
}
