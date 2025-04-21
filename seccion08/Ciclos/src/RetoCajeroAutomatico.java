import java.util.Scanner;

public class RetoCajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("*** Reto, Cajero Automatico ***");

        var consola = new Scanner(System.in);
        var salir = false;
        var saldo = 1000.0;

        while (!salir){
            System.out.printf("""
                    %n%n1. Consultar Saldo
                    2. Retirar fondos
                    3. Depositar
                    4. Salir
                    Elige una opción:\s""");
            var opcion = Integer.parseInt(consola.nextLine());
            switch (opcion){
                case 1 -> System.out.printf("Su saldo actual es de: $ %.2f", saldo);
                case 2 -> {
                    System.out.print("Ingrese el monto a retirar: ");
                    var montoRetirar = Double.parseDouble(consola.nextLine());
                    if (montoRetirar > saldo) {
                        System.out.printf("No tienes saldo suficiente, su saldo actual es de: $ %.2f", saldo);
                    }else {
                        saldo -= montoRetirar;
                        System.out.printf("Retiro realizado, saldo actual: $ %.2f", saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese el monto a depositar: ");
                    var montoDepositar = Double.parseDouble(consola.nextLine());
                    saldo += montoDepositar;
                    System.out.println("Su saldo actual es de: " + saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                    salir = true;
                }
            }
        }
            System.out.println("Gracias por usar el cajero");
    }
}
