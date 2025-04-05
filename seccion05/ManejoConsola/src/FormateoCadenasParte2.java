public class FormateoCadenasParte2 {
    public static void main(String[] args) {
        System.out.println("\n***  Formateo de Cadenas parte 2 ***");
        var nombre = "Matías";
        var edad = 35;
        var salario = 25100.50;
        var numeroEmpleado = 12;

        // Formateo con text block
        // Completar con 4 ceros a la izquierda en el NRO. EMPLEADO
        var mensaje = """
                %nDetalle Persona:\s
                --
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: %.3f
                """.formatted(nombre,numeroEmpleado,edad,salario);
        System.out.println(mensaje);

        // Formateo con text block y printf
        System.out.printf("""
                %nDetalle Persona con printf:\s
                --
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: %.3f
                """, nombre,numeroEmpleado,edad,salario);
    }
}
