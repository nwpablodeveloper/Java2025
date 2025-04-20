import java.util.Scanner;

public class RetoSistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Reto Sistem de autenticación ***");

        final var usuarioValido = "Admin";
        final var passwordValido = "123";

        var consola = new Scanner(System.in);

        System.out.print("Usuario? ");
        var usuario = consola.nextLine();

        System.out.print("Contraseña? ");
        var password = consola.nextLine();

        if (!usuario.equals(usuarioValido))
            System.out.println("Usuario no valido");
        else if (!password.equals(passwordValido))
            System.out.println("Password no valido");
        else
            System.out.println("Bienvenido al sistema");

    }
}
