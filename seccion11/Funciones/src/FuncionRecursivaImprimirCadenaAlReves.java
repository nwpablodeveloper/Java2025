public class FuncionRecursivaImprimirCadenaAlReves {
    //Descripción: Imprimir una cadena de texto al revés usando recursividad.
    //Ejemplo: invertir("hola") → "aloh"

    static String imprimirCadenaInversa(String cadena){
        if (cadena.isEmpty()) return cadena;
        return imprimirCadenaInversa(cadena.substring(1)) + cadena.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(imprimirCadenaInversa("ARGENTINA"));
        var hola = "HOLA";
    }
}
