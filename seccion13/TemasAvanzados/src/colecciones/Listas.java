package colecciones;// Llamamos a la interface lista (no se puede crear objetos de una interface)
import java.util.List;

// Llamamo a la clase ArrayList para poder crear Objetos
import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        // Acepta elementos repetidos
        miLista.add("Domingo");

        for (Object elemento : miLista){
            System.out.println("dia = " + elemento);
        }

    }
}
