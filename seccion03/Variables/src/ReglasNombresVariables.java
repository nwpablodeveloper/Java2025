public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas nombres variables
        String nombreCompleto = "Pablo Veiga"; // Correcto y buena práctica
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Pablo Veiga"; // Correcto, no aplica buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);

        // String nombre-cliente = "Pedro sanches"; // Incorrecto
        String nombre_cliente = "Pedro"; // Incorrecto, no aplica a buenas practicas
        String _apellido = "Veiga"; // Correcto y aceptable
        String $apellido = "Diaz"; // Correcto y aceptable

        int totPzs = 10; // Correcto, no es buena practica las abreviaturas (total piezas)
        int totalPiezas = 10; // Correcto, aplica buanas practicas.
        boolean casado = true; // Correcto , aun podemos mejorarla
        boolean esCasado = true; // Correcto, aplica buena practica
        boolean isCasado = true; // Correcto, aplica buena practica tambien en ingles
        boolean tieneSaldo = true; // Correcto, aplica buena practica
        boolean hasSaldo = true; // Correcto, aplica buena practica tambien en ingles

    }
}
