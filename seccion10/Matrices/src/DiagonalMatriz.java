import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args) {
        // Suma Diagonla de una Matriz
        int renglones, columnas;
        var consola = new Scanner(System.in);
        // Definir la matriz
        System.out.print("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglones][columnas];

        // Solicitamos los valores
        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("Valor["+ren+"]["+col+"] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }

        // Suma de la diagonal de la matriz
        var sumaDiagonal = 0;
        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                if (ren == col)
                    sumaDiagonal += matriz[ren][col];
            }
        }
        System.out.println("La suma de la diagonal es: " + sumaDiagonal);
    }
}
