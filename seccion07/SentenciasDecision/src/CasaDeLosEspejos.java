import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido a la  Casa de los Espejos ***");

        var consola = new Scanner(System.in);

        System.out.print("Cuál es tu edad? ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Te da miedo la oscuridad? ");
        var tienesMiedoOscuridad = Boolean.parseBoolean(consola.nextLine());

        // Verificación aplicando la lógica inversa
        if (!tienesMiedoOscuridad && edad >= 10 ){
            System.out.println("Puedes entrar a la casa de los espejos");
        }else {
            System.out.println("Los siento, la casa de los espejos podría darte miedo.");
        }
    }
}
