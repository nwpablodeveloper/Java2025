public class IterrarArreglo {
    public static void main(String[] args) {

        // Usando var estamos obligados a inicializar su valor
        var enteros = new int[]{100, 200, 300, 400, 500};

        // Imprimir la dirección de memoria donde esta el arreglo
        System.out.println("Dirección de memoria = " + enteros);

        // Iterar los elementos del arreglo
        for (int i = 0; i < enteros.length; i++)
            System.out.println(enteros[i]);

    }
}
