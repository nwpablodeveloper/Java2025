public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Asignación ***");
        // Asignación
        var miNumero = 10; // Usamos el operador de asignación para asignar un valor,
        int miNUmeros2; // No usamos el operador de asignación por que el INT por default es 0

        // Asignación compuesto
        // +=
        miNumero += 5; // miNumero = miNumero + 5;
        System.out.println("miNumero = " + miNumero);

        // -=, *=, /=, y %=
        miNumero *= 2; // miNumero = miNumero * 5;
        System.out.println("miNumero = " + miNumero);

        // Asignación de variables multiples
        int a = 10, b = 15, c = 20; // Todas las variables deben ser del mismo tipo
        System.out.printf("a = %d, b = %d, c = %d",a,b,c);
    }
}
