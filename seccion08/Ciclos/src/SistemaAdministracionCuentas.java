import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;

        while (!salir){
            System.out.printf("""
                    *** Sistema de administración de cuentas ***
                    Manú:
                    1. Crear Cuenta
                    2. Eliminar Cuenta
                    3. Salir
                    Escoge una opción:\s""");
            var opcion = Integer.parseInt(consola.nextLine());
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema, hasta pronto");
                    salir = true;
                }
                default -> System.out.println("Opción no valida");
            }
        }
        System.out.println("Fin de administración de cuentas");
    }
}
