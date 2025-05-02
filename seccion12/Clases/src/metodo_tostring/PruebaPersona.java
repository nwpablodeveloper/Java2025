package metodo_tostring;


public class PruebaPersona {
    public static void main(String[] args) {

        var persona1 = new Persona("Pablo", "Veiiiiga");
        persona1.setApellido("veiga");

        // Se llama de forma autatica al metodo toString si es que lo tenemos declarado
        // Caso ocntrario veremos la dirección de memoria
        System.out.println(persona1);
    }
}
