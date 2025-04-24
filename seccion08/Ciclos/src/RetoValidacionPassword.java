import java.util.Scanner;

public class RetoValidacionPassword {
    public static void main(String[] args) {
        System.out.println("*** Reto, Validación de Password ***");

        var consola = new Scanner(System.in);

        var password = "";
        do {
            System.out.print("Ingrese su nueva contraseña: ");
            password = consola.nextLine();

            if (password.length() < 7)
                System.out.println("La contraseña debe de tener un minimo de 6 caracteres.");

        } while (password.length() < 7);
    }
}
