package colecciones;// Llamamos a la interface lista (no se puede crear objetos de una interface)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodosReferencia {
    public static void main(String[] args) {

        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");

        /*
            Funciones Lambda
            Es una función anonima de un codigo muy compacto
            1 o 2 lineas de código 
            Conocida tambien como programción funcional
         */
//        System.out.println("\nFUNCION LAMBDA");

//        miLista.forEach( elemento -> {
//            System.out.println("elemento = " + elemento);
//        });

        System.out.println("\nMÉTODO REFERENCIA");
        // Usando un METODO REFERENCIA
        miLista.forEach(System.out::println);

        // Array list
        List<String> nombres = Arrays.asList("Pablo", "Romina", "Sophi");
        System.out.println("\nUsando Arrays list");
        nombres.forEach(System.out::println);

    }
}
