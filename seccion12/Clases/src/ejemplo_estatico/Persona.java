package ejemplo_estatico;

public class Persona extends Object {

    static int contadorPersonas = 0; // Atributo estatico, no se reinicia al crear los Objetos
    private int idPersona; // Utiliazado para cada Objeto creado

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

        this.idPersona = ++Persona.contadorPersonas;
    }

    @Override
    public String toString(){
        return "ID: " + this.idPersona
                + "\nNombre: " + this.nombre
                + "\nApellido: " + this.apellido
                + "\nDirección de memoria: "
                + super.toString(); // Para imprimir la dirección de memoria del Objeto
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
