package colecciones;// Llamamos a la interface lista (no se puede crear objetos de una interface)

import java.util.ArrayList;
import java.util.List;

public class FuncionesLambda {
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
        System.out.println("\nFUNCION LAMBDA");

        miLista.forEach( elemento -> {
            System.out.println("elemento = " + elemento);
        });

    }
}
