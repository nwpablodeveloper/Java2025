import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {

        System.out.println("*** Reto Sistem de autenticación ***");

        final var USUARIO_VALIDO = "Admin";
        final var PASSWORD_VALIDO = "123";

        var consola = new Scanner(System.in);

        System.out.print("Usuario? ");
        var usuario = consola.nextLine().strip();

        System.out.print("Contraseña? ");
        var password = consola.nextLine().strip();

        // Cada caso de validación de usuario y contraseña
        var mensajeAutenticacion = switch (usuario){
            case USUARIO_VALIDO -> {
                if (PASSWORD_VALIDO.equals(password))
                    yield "Bienvenido al Sistema";
                else
                    yield "Password incorrecto";

            }
            default -> {
                if(PASSWORD_VALIDO.equals(password))
                    yield "Usuario incorrecto";
                else
                    yield "Usuario y password no validos";
            }
        };

        System.out.println(mensajeAutenticacion);

    }
}
