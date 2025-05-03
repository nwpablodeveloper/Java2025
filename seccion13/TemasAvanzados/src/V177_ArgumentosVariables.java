public class V177_ArgumentosVariables {

    // Recibir parametros sin conocer su cantidad de un mismo tipo int...
    static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " - ");
        }
    }


    // Recibir parametros sin conocer su cantidad y de diferentes tipos de datos
    // Los parametros variables debe de ir al final de la fimra
    static void argumentosDiferenteTipo(String nombre, int... numeros){
        System.out.println("\n\n--- Argumentos de diferente tipos ---");
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);

    }


    public static void main(String[] args) {
        // Enviar muchos argumentos del mismo tipo de datos
        imprimirNumeros(1, 2, 3, 17, 20, 30, 11, 25, 33, 14, 28, 34);

        // Enviar muchoas argumentos de diferente tipos de datos
        argumentosDiferenteTipo("Pablo", 18, 22, 33);

    }

}
