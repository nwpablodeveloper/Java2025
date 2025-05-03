package V180_interfaces;

// Una Interface no puede ser instanciada
public interface Traductor {
    // si no especificamos los metodos son públicos y abstractos

    void traducir();

    // Metodos con implementación por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor");
    }
}

class Ingles implements Traductor{

    @Override // No estamos sobreescribiendo, estamos implementando
    public void traducir() {
        System.out.println("Traducimos a Ingles");
    }
}

class Frances implements Traductor{

    public void traducir(){
        System.out.println("Traduzco al frances");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("\nIniciando el traductor en Frances...");
    }
}

class PruebaTraudctor{
    public static void main(String[] args) {
        Traductor idioma = new Ingles();
        idioma.iniciarTraductor(); // Metodo heredado
        idioma.traducir();

        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}
