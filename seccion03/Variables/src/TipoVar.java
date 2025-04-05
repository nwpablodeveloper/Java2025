public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        // Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        // Con el uso de var
        var nombre2 = "Carlos"; // var, infiere el tipo de variable
        System.out.println("nombre2 = " + nombre2);
        // Definir otras variables usando var
        var edad = 36; // Ifiere de tipo Boolean
        System.out.println("edad = " + edad);
        var sueldo = 500.5F; // Ifiere de tipo Float "F"
        System.out.println("sueldo = " + sueldo);
        var esCasado = false; // Infiere de tipo boolean
        System.out.println("esCasado = " + esCasado);
//        esCasado = "NO"; // No podemos asigunar un valor de un tipo distinto
//        var precio; Tenesmo que asignar un valor al declarar la variable var
//        var apellido = null;  no se puede inferir el tipo de dato
    }
}
