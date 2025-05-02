package metodo_estatico;


public class PruebaPersona {
    public static void main(String[] args) {

        // Ver variable estatica ya no se puede usar por que es "private"
        // System.out.println("Variable Estatica: " + Persona.contadorPersonas);
        System.out.println("Variable Estatica: " + Persona.getContadorPersonas());

        var persona1 = new Persona("Pablo", "Veiiiiga");
        persona1.setApellido("veiga");
        System.out.println(persona1);

        // Uso del metodo estatico, Buena practica accediendo con el nombre de la Clase
        System.out.println("Variable Estatica: " + Persona.getContadorPersonas() + "\n");

        var persona2 = new Persona("Romina", "Diaz");
        System.out.println(persona2);

        // Usando el metodo estatico desde el objeto, pero no es buena practica por medio de los Objetso
        System.out.println("Variable Estatica: " + persona2.getContadorPersonas()); // NO es buena practica

    }
}
