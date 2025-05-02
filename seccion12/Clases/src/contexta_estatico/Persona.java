package contexta_estatico;

public class Persona extends Object {
    // La variable NO se reinicia en cada objeto creado

    /*
        int contadorPersona, solo se va a asociar al objeto del momento y la variable
        siempre se va a reinicar en cada objeto creado
    */
    static int contadorPersonas = 0; // Atributo estatico

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

        // Incrementar el atributo estatico
        Persona.contadorPersonas++;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido
                + "\nDirección de memoria: " + super.toString();
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
