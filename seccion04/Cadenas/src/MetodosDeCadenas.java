public class MetodosDeCadenas {
    public static void main(String[] args) {
        // Método de cadenas
        var cadena1 = "Hola Mundo";
        
        // Obtener el largo de una cadena (longitud)
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);
        
        // Reemplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        // Covertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        // Convertir a minusculas
        System.out.println("Minisculas = " + mayusculas.toLowerCase());

        // Eliminar espacios al inicio y al final
        var cadena2 = "        Leo Reyes      ";
        System.out.println("Con espacios = " + cadena2);
        System.out.println("Eliminar espacios al inicio y al final = " + cadena2.trim());
    }
}
