import java.util.Scanner;

public class RetoSistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Reto, Sistema de calificaciones ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese la calificación: ");
        var calificacion = Double.parseDouble(consola.nextLine());

        var letraCalificacion =
                (calificacion >= 9 && calificacion <=10) ? "A" :
                    (calificacion >= 8 && calificacion < 9) ? "B" :
                        (calificacion >= 7 && calificacion <8) ? "C" :
                                (calificacion >= 6 && calificacion <7) ? "D" :
                                        (calificacion >= 0 && calificacion <6) ? "F" :
                                                "Valor desconocido";

                ;

        System.out.println("Tu calificación corresponde a: " + letraCalificacion);
    }
}
