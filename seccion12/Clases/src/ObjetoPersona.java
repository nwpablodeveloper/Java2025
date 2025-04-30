public class ObjetoPersona {
    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("Nombre: " + nombre);
        System.out.println("apellido: " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creació de Clase y Objeto de tipo objeto1 ***");

        var objeto1 = new ObjetoPersona();
        objeto1.nombre = "Layla";
        objeto1.apellido = "Acosta";
        objeto1.mostrarPersona();

        var objeto2 = new ObjetoPersona();
        objeto2.nombre = "Ian";
        objeto2.apellido = "Gomez";
        objeto2.mostrarPersona();
    }
}
