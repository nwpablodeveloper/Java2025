public class SintaxisSimplificada {
    public static void main(String[] args) {
        // Definimos una matriz

        var matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };

        // Recorrer una matriz
        // 1. Recorrer los renglones
        for (int ren = 0; ren < matriz.length; ren++) {
            // 2. Recorrer las columnas
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("Valor["+ren+"]["+col+"] = " + matriz[ren][col]);
            }
        }
    }
}
