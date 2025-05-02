package contexta_estatico;


public class PruebaPersona {
    public static void main(String[] args) {

        // Ver variable estatica
        System.out.println("Variable Estatica: " + Persona.contadorPersonas);

        var persona1 = new Persona("Pablo", "Veiiiiga");
        persona1.setApellido("veiga");
        System.out.println(persona1);
        System.out.println("Variable Estatica: " + Persona.contadorPersonas + "\n");

        var persona2 = new Persona("Romina", "Diaz");
        System.out.println(persona2);
        System.out.println("Variable Estatica: " + Persona.contadorPersonas);

    }
}
