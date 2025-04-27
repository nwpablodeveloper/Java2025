public class SintaxisSimplificada {
    public static void main(String[] args) {
        // Arreglo
        int[] enteros = {100, 200, 300, 400, 500};

        // Usando var estamos obligados a inicializar su valor
        var enteros2 = new int[]{100, 200, 300, 400, 500};

        // Imprimir la dirección de memoria donde esta el arreglo
        System.out.println("Dirección de memoria = " + enteros2);

        System.out.println("Valor 0 = " + enteros2[0]);
        System.out.println("Valor 1 = " + enteros2[1]);
        System.out.println("Valor 2 = " + enteros2[2]);
        System.out.println("Valor 3 = " + enteros2[3]);
        System.out.println("Valor 4 = " + enteros2[4]);


    }
}
