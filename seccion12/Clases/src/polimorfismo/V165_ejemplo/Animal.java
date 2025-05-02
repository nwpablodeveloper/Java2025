package polimorfismo.V165_ejemplo;

public class Animal {
    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal{

    @Override
    public void hacerSonido(){
        System.out.println("El perro hace wauf");
    }

}

class Gato extends Animal{

    @Override
    protected void hacerSonido() {
        System.out.println("El gato hace miau");
    }

}

class PruebaAnimal{

    // Metodo polimorfico
    static void imprmirSonido(Animal animal){ // Usamos como tipo de dato el mas generico
        animal.hacerSonido();
    }

    public static void main(String[] args) {

        // Crear objeto de la clase padre
        System.out.println("Ejemplo Objeto Padre");
        var animal = new Animal();
        imprmirSonido(animal);

        System.out.println("\nEjemplo Objeto hijo");
        var animal2 = new Perro();
        imprmirSonido(animal2);

        System.out.println("\nEjemplo Objeto hijo");
        var animal3 = new Gato();
        imprmirSonido(animal3);
    }
}
