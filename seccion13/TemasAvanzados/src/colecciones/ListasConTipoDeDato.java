package colecciones;// Llamamos a la interface lista (no se puede crear objetos de una interface)

import java.util.ArrayList;
import java.util.List;

public class ListasConTipoDeDato {
    public static void main(String[] args) {

        // Especificamos el tipo de dato de los elementos a guardar en una lista
        List<String> miLista = new ArrayList<>();

        // Ahora solo acepta datos de tipo String
        // miLista.add(3434);

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");


        // Acepta elementos repetidos
        miLista.add("Domingo");

        for (String elemento : miLista){
            System.out.println("dia = " + elemento);
        }

    }
}
