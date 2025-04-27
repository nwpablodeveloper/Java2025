import java.util.Scanner;

public class RetoPromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Reto, promedio de Calificaciones ***");
        var consola = new Scanner(System.in);
        System.out.print("Cuantas Calificaciones deseas agregar? ");
        var cantidadCalificaciones = consola.nextInt();
        var calificaciones = new int[cantidadCalificaciones];

        var promedio = 0.0;
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Calificación["+i+"] = ");
            calificaciones[i] = consola.nextInt();
            promedio += calificaciones[i];
        }

        System.out.println("Promedio de las Calificaciones: " + promedio / cantidadCalificaciones);


    }
}
