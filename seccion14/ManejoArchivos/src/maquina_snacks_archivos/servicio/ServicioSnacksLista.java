package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks {

    private static final List<Snack> snacks;
    private int contador;
    private static int contadorSnack;

    // Los construcores se usan para crear Objetos, esta clase no va a crear Objetos

    // Usaremos Bloques estaticos para inicializar nustrar variables
    static {
        // Inicializamos un inventario de base
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70.23));
        snacks.add(new Snack("Refresco", 50.72));
        snacks.add(new Snack("Sandwich", 120.31));
    }

    public void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public void mostrarSnacks(){
        var inventarioSnacks = "";
        for (var snack : snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el inventario ---");
        System.out.println(inventarioSnacks);
    }

    public List<Snack> getSnacks(){
        return snacks;
    }
}

