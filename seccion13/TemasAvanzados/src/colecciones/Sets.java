package colecciones;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        miSet.add("Domingo"); // Ignora los elementos repetidos
        miSet.add("Domingo");

        // Los imprime en cualquier orden alfabético
        miSet.forEach(System.out::println);

        Set<String> miSetOrdenado = new TreeSet<>();
        miSetOrdenado.add("a");
        miSetOrdenado.add("c");
        miSetOrdenado.add("s");
        miSetOrdenado.add("e");
        miSetOrdenado.add("b");
        miSetOrdenado.add("d");
        miSetOrdenado.add("f");
        miSetOrdenado.add("f"); // Ignora duplicados

        // TreeSet los imprime en orden
        System.out.println("\nTREESET ");
        miSetOrdenado.forEach(System.out::println);

        // Eliminar elementos
        miSetOrdenado.remove("f");
        System.out.println("\nTREESET ");
        miSetOrdenado.forEach(System.out::println);
    }
}
