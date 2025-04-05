public class BusquedaSubcadenas {
    public static void main(String[] args) {
        // Buscar subcadenas
        // IndexOf - Devuelve el indice de la primera aparicioón de la subcadena

        var cadena1 = "Hola Mundo";
        // Buscar Subcadena "Hola"
        System.out.println(cadena1.indexOf("Hola"));

        // lastIndexOf - devuelve el indice de la ultima aparición de la subcadena
        System.out.println(cadena1.lastIndexOf("Mundo"));

        // Subcadena no encontrada devuelve -1
        System.out.println(cadena1.indexOf("Java"));
    }
}
