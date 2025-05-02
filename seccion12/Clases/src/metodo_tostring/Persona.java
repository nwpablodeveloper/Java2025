package metodo_tostring;

public class Persona extends Object { // Heredan de la clas object
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Metodo heredado de la clase padre
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido
                + "\nDirección de memoria: " + super.toString();
        /*
            Con super accedemos al metodo toString de la clase padre quien es que se encarga
            de mostrar la dirección de memoria del objecto
        */
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
