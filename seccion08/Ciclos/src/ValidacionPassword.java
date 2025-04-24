import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("*** Validación de password ***");

        System.out.print("Ingresa un password de almenos 6 caracteres: ");
        var password = consola.nextLine();

        // Valida el password
        while (password.length() < 7){
            System.out.println("El password no cumple con los requisitos. " +
                    "Debe tener al menos 6 caracteres");
            System.out.print("Ingresa un nuevo valor de password: ");
            password = consola.nextLine();
        }
        System.out.println("El valor de password es valido: -> " + password);
    }
}
