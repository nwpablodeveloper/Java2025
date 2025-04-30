package prueba_paquete;

import aritmetica_paquete.AritmeticaPaquete;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmética ***");

        var aritmetica1 = new AritmeticaPaquete(5, 7);
        aritmetica1.sumar();
        aritmetica1.restar();

        // Creamos un segundo objeto
        var aritmetica2 = new AritmeticaPaquete(8,50);
        aritmetica2.sumar();
        aritmetica2.restar();

    }
}
