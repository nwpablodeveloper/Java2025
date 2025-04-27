import java.util.Scanner;

public class RetoSumaDiagonal {
    public static void main(String[] args) {
        System.out.println("*** Reto, realizar la suma de la diagonal de una matriz entera ***");
        
        var consola = new Scanner(System.in);
        System.out.print("Cuantas fila va a tener la matria: ");
        var renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Cuantas columnas va a tener la matria: ");
        var columnas  = Integer.parseInt(consola.nextLine());
        
        var matriz = new int[renglones][columnas];

        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("Valor para posición["+ren+"]["+col+"]: ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }

        var sumaDiagonal = 0;
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("Matriz["+ren+"]["+col+"]: " + matriz[ren][col]);
                if (ren == col)
                    sumaDiagonal += matriz[ren][col];
            }
        }
        System.out.println("La suma de la diagonal es: " + sumaDiagonal);
    }
}
