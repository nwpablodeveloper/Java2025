public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // Mas formas de concatenar cadenas
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);

        // Metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);

        // StringBuilder es un metodo mas eficientes para concatener cadenas de manera repetitivas
        var constructorCadenas = new StringBuilder();
        /*constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);*/
        constructorCadenas.append(cadena1).append(" ").append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado con StringBuilder = " + resultado);

        // StringBuffer es seguro cuando estamos trabajando con varios Hilos o procesos a la vez
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("resultado con StringBuffer = " + resultado);

        // Join - unir 2 o mas cadenas
        resultado = String.join("-", cadena1, cadena2, "agregando otro valor");
        System.out.println("resultado con Join = " + resultado);
        
    }
}
