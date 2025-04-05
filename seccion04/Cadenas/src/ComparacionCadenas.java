public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparación de cadenas (pool de cadenas)
        // Las siguientes 2 variiables de tipo Object van a usar la misma referencia en memoria
        var cadena1 = "Java";
        var cadena2 = "Java"; // Como es igual al objeto cadena1 Java va asignar la misma referencia en RAM
        var cadena3 = new String("Java"); // Forzamos a crear una nueva referencia en memoria

        // Compración de cadenas (==) comparar la referencia
        System.out.print("referencia cadena1 == referencia cadena2: ");
        System.out.println(cadena1 == cadena2);

        System.out.print("referencia cadena1 == referencia cadena3: ");
        System.out.println(cadena1 == cadena3);

        // Comparar el contenido de los objetos "equals
        System.out.print("contenido cadena1 == contenido cadena3: ");
        System.out.println(cadena1.equals(cadena3));

    }
}
