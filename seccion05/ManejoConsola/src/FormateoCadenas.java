public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("***  Formateo de Cadenas ***");
        var nombre = "Matías";
        var edad = 35;
        var salario = 25100.50;

        // String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.3f"
                , nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.3f%n"
                , nombre, edad, salario);
    }
}
