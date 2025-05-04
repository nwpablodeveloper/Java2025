package colecciones;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("nombre", "Pablo");
        persona.put("apellido", "Veiga");
        persona.put("edad", "36");
        persona.put("edad", "36"); // El elemento duplicado es ignorado

        System.out.println("\nMapa impreso");
        System.out.println(persona);
        // Imprimir
        // Convertilo a un tipo Set
        System.out.println("\n1ro convertirlo a un tipo Set");
        System.out.println(persona.entrySet());

        // Recorrerlo con un forEach
        System.out.println("\n2do Recorrerlo con un forEach");
        persona.entrySet().forEach( elemento -> {
            System.out.println(elemento);
        });

        // Función Lambda
        System.out.println("\nAcortar con función Lambda");
        persona.entrySet().forEach(System.out::println);

        // Modificar valor de una llave existente
        persona.put("edad", "37");
        System.out.println("\nSobreescribir un valor");
        persona.entrySet().forEach(System.out::println);

        // Eliminar un valor
        persona.remove("nombre");
        persona.remove("erer"); // Si la llave no existe, lo ignora
        System.out.println("\nUn valor fue eliminado");
        persona.entrySet().forEach(System.out::println);

        // Iterar sobre los elemnentos del mapa por separado
        System.out.println("\nIterando los elemnentos (llave, valor)");
        // persona.forEach( (llave, valor) -> {
        // persona.forEach( (key, value) -> {
        persona.forEach( (k, v) -> {
            System.out.println("LLava: " + k + ", Valor: " + v);
        });


        // Acortar
        System.out.println("\nAcortar la función Lambda");
        persona.forEach( (k, v) -> System.out.println("Llave: " + k + ", Valor: " + v));


    }
}
