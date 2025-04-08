import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** Bienvenidos al Sistema Bancario ***");

        var consola = new Scanner(System.in);

        System.out.print("Deseas salir del sistema (true/false): ");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        // Verificamos (aplicando un lógica inversa)
        if (!salirSistema){
            System.out.println("Continuamos dentro del sistema");
        }else {
            System.out.println("Saliendo del Sistema");
        }
    }
}
