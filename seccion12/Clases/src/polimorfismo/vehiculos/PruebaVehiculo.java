package polimorfismo.vehiculos;

public class PruebaVehiculo {

    static void acelerarVehiculo(Vehiculo vehiculo){
        vehiculo.acelerar();
    }

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo auto = new Auto();
        Vehiculo moto = new Moto();

        acelerarVehiculo(vehiculo);
        acelerarVehiculo(auto);
        acelerarVehiculo(moto);
    }

}
