package sobreescritura.parte_1;

public class Animal {
    protected void comer(){
        System.out.println("Como muchas veces al día");
    }

    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }
}

class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("Puedo Ladrar");
    }

    // Sobreescritura de un metodo de la clase padre
    @Override
    protected void dormir() {
        System.out.println("Duermo 15 horas al día");
    }
}

class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de Herencia ***");
        System.out.println("*** Clase Padre, soy un Animal ***");
        var animal1 = new Animal(); // Clase Padre
        animal1.comer();
        animal1.dormir();
        // animal1.hacerSonido(); // Este mmetodo no existe en la clase Padre

        System.out.println("\nClase hija, soy un perro");
        var perro1 = new Perro(); // Clase hija
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();
    }
}
