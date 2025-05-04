package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {

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

    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){
        var inventarioSnacks = "";
        for (var snack : snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el inventario ---");
        System.out.println(inventarioSnacks);
    }
}

