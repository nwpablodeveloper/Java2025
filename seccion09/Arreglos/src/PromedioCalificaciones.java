import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");
        var consola = new Scanner(System.in);
        System.out.print("Cuantas calificaciones deseas agregar? ");
        var totalCalificaciones = Integer.parseInt(consola.nextLine());
        
        // Creamos el arreglo
        var calificaciones = new int[totalCalificaciones];
        
        // Solitar los valores de cada calificación
        for (int i = 0; i < totalCalificaciones; i++) {
            System.out.print("Calificaciones["+i+"] = ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }
        
        // Obtener el promedio de las calificaciones
        var sumaCalificaciones = 0.0;
        for (int i = 0; i < totalCalificaciones; i++) {
            sumaCalificaciones += calificaciones[i];
        }
        
        var promedio = sumaCalificaciones / totalCalificaciones;
        System.out.println("promedio = " + promedio);
        
    }
}
