import java.util.Locale;
import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Empleados ***");

        var consola = new Scanner(System.in);
        consola.useLocale(Locale.US);

        // Nombre empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        // Edad del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        // Salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        // Es jefe de departamento
        System.out.print("Es jefe de departamento: ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir los valores del Empleao
        System.out.println("\nDatos del Empleado");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado + " Años");
//        System.out.println("\tSalario: " + salarioEmpleado);
        System.out.printf("\tSalarios: $ %.3f%n", salarioEmpleado);
        System.out.println();
        System.out.println("\tEs Jefe de departamento: " + esJefeDepartamento);

    }
}
