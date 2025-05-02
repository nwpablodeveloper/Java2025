package polimorfismo.vehiculos;

public class Vehiculo {
    protected void acelerar(){
        System.out.println("El vehículo esta acelarando");
    }
}

class Auto extends Vehiculo{

    @Override
    protected void acelerar() {
        System.out.println("El auto esta acelerando");
    }
}

class Moto extends Vehiculo{

    @Override
    protected void acelerar() {
        System.out.println("La moto acelero");
    }
}
