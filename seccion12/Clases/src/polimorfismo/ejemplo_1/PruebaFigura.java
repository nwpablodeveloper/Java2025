package polimorfismo.ejemplo_1;

public class PruebaFigura{

    static void calcularArea(Figura figura){
        figura.mostrarArea();
    }

    public static void main(String[] args) {
        Figura generica = new Figura();
        Figura cuadrado = new Cuadrado();
        Figura circulo = new Circulo();

        calcularArea(generica);
        calcularArea(cuadrado);
        calcularArea(circulo);

    }
}
