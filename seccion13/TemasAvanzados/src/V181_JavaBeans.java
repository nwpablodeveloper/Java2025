import java.io.Serializable;

public class V181_JavaBeans {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("Pablo");
        persona1.setApellido("Veiga");
        System.out.println(persona1);
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        System.out.println("persona1.getApellido() = " + persona1.getApellido());
    }
}

// Clase de JavaBeans, tiene que tener la implementación Serializada
// Serializable permite guardar el objeto en el HDD o enviar por la red
class Persona implements Serializable {
    // Para que sea JavaBeans sus atributos tiene que estar encapsulados (privados)
    private String nombre;
    private String apellido;

    // Para que sea JavaBeans tiene que tener un constructor vacio
    public Persona(){}

    // Para que sea JavaBeans tiene que tener los metodos Get y Set de los atributos
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

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
