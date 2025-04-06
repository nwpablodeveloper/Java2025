import java.util.Objects;
import java.util.Scanner;

public class RetoSistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema Autenticación ***");

        final var NOMBRE_USUARIO = "capitan";
        final var PASSWORD = "123456";

        var consola = new Scanner(System.in);

        System.out.print("Cuál es tu usuario? ");
        var usuario = consola.nextLine();

        System.out.print("Cuál es tu password? ");
        var password = consola.nextLine();

        var acceso = usuario.equals(NOMBRE_USUARIO) && password.equals(PASSWORD);

        System.out.print("Datos son correctos? " + acceso);

    }
}
