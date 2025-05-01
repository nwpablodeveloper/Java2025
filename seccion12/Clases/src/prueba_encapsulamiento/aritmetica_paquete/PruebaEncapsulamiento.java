package prueba_encapsulamiento.aritmetica_paquete;

import aritmetica_encapsulamiento.aritmetica_paquete.AritmeticaEncapsulamiento;

public class PruebaEncapsulamiento {
    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmética ***");

        var aritmetica1 = new AritmeticaEncapsulamiento(5, 7);
        System.out.println("Atributo operando 1: " + aritmetica1.getOperando1()); // Uso de Get
        aritmetica1.setOperando1(10);   // Usando Set
        aritmetica1.setOperando2(15);   // Usando Set
        aritmetica1.sumar();
        aritmetica1.restar();

        // aritmetica1.operando1; // Como esta encapsulado con el modficador Private, ya no se puede acceder
        aritmetica1.operando3 = 3; // no esta encapsulado


    }

}
