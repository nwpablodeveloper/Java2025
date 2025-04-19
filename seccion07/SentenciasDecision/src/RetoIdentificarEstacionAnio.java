import java.util.Scanner;

public class RetoIdentificarEstacionAnio {
    public static void main(String[] args) {
        System.out.println("*** Identificar la estación del Año ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese el mes del año en número: ");
        var mes = Integer.parseInt(consola.nextLine());

        if (mes == 1 || mes == 2 || mes == 12)
            System.out.println("Invierto");
        else if (mes >= 3 && mes <= 5)
            System.out.println("Primavera");
        else if (mes >=6 && mes <=8)
            System.out.println("Verano");
        else if (mes >= 9 && mes <=11)
            System.out.println("Otoño");
        else
            System.out.println("Mes no valido");
    }
}
