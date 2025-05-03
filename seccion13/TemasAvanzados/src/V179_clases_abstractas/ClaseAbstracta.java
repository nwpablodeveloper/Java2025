package V179_clases_abstractas;

/*
    Las clases abstractas son aquellas que dejan sin implementar algunos de sus metodos,
    para que luego las clases hijas o derivadas proporcionen la implementación.
 */
public class ClaseAbstracta {
    public static void main(String[] args) {

        // FiguraGeometrica figura = new FiguraGeometrica(); // No se pueden crear objetos de la clase Abstracta
        FiguraGeometrica figura = new Rectangulo();
        figura.dibujar();

        /*
            "figura" es del tipo de clase con mas jerarquia y podemos sobreescrir con otro tipo de dato de clases
            hijas
         */
        figura = new Circulo();
        figura.dibujar();
    }
}

// Clase abstracata
abstract class FiguraGeometrica{ // No se puede instanciar (crear objetos de esta clase)
    public abstract void dibujar();
}

// Esta obligada a implementar los metodos abstractos de la clase padre
class Rectangulo extends FiguraGeometrica{

    @Override
    public void dibujar() {
        System.out.println("Dibujando un Rectangulo");
    }
}

class Circulo extends FiguraGeometrica{

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }
}
