public class Matrices {
    public static void main(String[] args) {
        System.out.println("*** Matrices ***");
        // Definimos una matriz de 2 renglones por 3 columans
        int[][] matriz1 = new int[2][3];

        // Usando var
        var matriz = new int[2][3]; // Espacio reservado en memoria

        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        // Acceder a algunos valores
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 5 [1][1] = " + matriz[1][1]);
        System.out.println("Valor 6 [1][1] = " + matriz[1][1]);
    }
}
