import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Cálculo del Área de un Rectangulo ");

        var consola = new Scanner(System.in);

        System.out.print("Proporciona la base: ");
        var base = Integer.parseInt(consola.nextLine());

        System.out.print("Proporciona la altura: ");
        var altura = Integer.parseInt(consola.nextLine());

        // Realizamos el calculo del área
        var areaRectangulo = base * altura;
        System.out.println("Área del rectangulo: " + areaRectangulo);

        // Realizamos el calculo del perimetro
        var perimetroRectangulo = 2 * (base + altura);
        System.out.println("Perimetro del rectanuclo : " + perimetroRectangulo);

    }
}
