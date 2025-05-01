package reto.reto_persona;

public class RetoPruebaPersona {
    public static void main(String[] args) {

        var persona1 = new RetoPersona("Pablo", "Veiiiiga");
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());
        persona1.setApellido("Veiga");
        System.out.println(persona1.getApellido());
    }
}
