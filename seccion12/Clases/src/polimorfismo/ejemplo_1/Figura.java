package polimorfismo.ejemplo_1;

public class Figura {
     protected void mostrarArea(){
        System.out.println("Área de la figura generica");
    }
}

class Cuadrado extends Figura{
    protected void mostrarArea(){
        System.out.println("Area de un cadrado: lado * lado");
    }
}

class Circulo extends Figura{
    protected void mostrarArea(){
        System.out.println("Área del circulo: π * radio");
    }
}

