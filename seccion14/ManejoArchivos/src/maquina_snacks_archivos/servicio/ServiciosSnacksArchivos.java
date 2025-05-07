package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServiciosSnacksArchivos implements IServicioSnacks{

    private final String NOMBRE_ARCHIVO = "snacks.txt";

    // Crear lista de Snacks
    List<Snack> snacks = new ArrayList<>();

    // Constructor
    public ServiciosSnacksArchivos() {
        // Creamos el archivo si no existe
        var archivo = new File(this.NOMBRE_ARCHIVO);
        var existe = false;

        try {
            existe = archivo.exists();
            if (existe){
                this.snacks = obtenerSnacks();
            }else{
                var salida = new PrintWriter(new FileWriter(this.NOMBRE_ARCHIVO));
                salida.close();
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivos: " + e);
            e.printStackTrace();
        }

//         Si no existe, cargamos algunos Snacks iniciales
        if (!existe){
            cargarSnacksIniciales();
        }

    }

    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("Papas", 70.23));
        this.agregarSnack(new Snack("Refresco", 50.72));
        this.agregarSnack(new Snack("Sandwich", 120.31));
    }

    private List<Snack> obtenerSnacks(){
        List<Snack> snacks = new ArrayList<>();

        try{
            List<String> lineas = Files.readAllLines(Paths.get(this.NOMBRE_ARCHIVO));

            lineas.forEach(linea ->{
                String[] lineaSnack = linea.split(",");
                var idSnack = lineaSnack[0];
                var nombre = lineaSnack[1];
                var precio = Double.parseDouble(lineaSnack[2]);
                snacks.add(new Snack(nombre, precio));
            });

        } catch (IOException e) {
            System.out.println("Error al leer todo el archivo de Snacks: " + e.getMessage());
            e.printStackTrace();
        }

        return snacks;
    }

    @Override
    public void agregarSnack(Snack snack) {
        /*
            Agregamos el nuevo Snack
            1. Agregar en la lista de memoria
         */
        this.snacks.add(snack);

        // 2. Agregar el Snack al archivo
        this.agregarSnacksArchivo(snack);
    }

    private void agregarSnacksArchivo(Snack snack){

        boolean anexar = false;
        var archivo = new File(this.NOMBRE_ARCHIVO);

        try{
            anexar = archivo.exists(); // Sobreescribir o anexar ?
            var salida = new PrintWriter(new FileWriter(this.NOMBRE_ARCHIVO, anexar));
            salida.println(snack.escribirSnack());
            salida.close();
        } catch (IOException e) {
            System.out.println("Error al agregar Snacks al arhivo: " + e);
            e.printStackTrace();
        }

    }

    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el inventario ---");
        // Mostramos la lista de Snacks en el archivo
        this.snacks.forEach(System.out::println);
    }

    @Override
    public List<Snack> getSnacks() {
        return List.of();
    }
}
