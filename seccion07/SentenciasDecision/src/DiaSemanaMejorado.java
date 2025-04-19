import java.util.Scanner;

public class DiaSemanaMejorado {
    public static void main(String[] args) {
        System.out.println("*** Día de la Semana con Switch Mejorado ***");
        var consola = new Scanner(System.in);

        System.out.printf("Ingrese el número de dia: ");
        var dia = Integer.parseInt(consola.nextLine());

        var diaSemana = switch (dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Día no valido";
        };

        System.out.println("Día de la semana es: " + diaSemana);



    }
}
