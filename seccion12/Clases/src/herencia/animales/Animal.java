package herencia.animales;

public class Animal {
    protected void comer(){
        System.out.println("Como muchas veces al día");
    }

    protected void dormir(){
        System.out.println("Dueromo muchas horas");
    }
}

class Perro extends Animal{
    public void hacerSonido(){
        System.out.println("Puedo Ladrar");
    }
}
