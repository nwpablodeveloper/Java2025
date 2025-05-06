package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArchivos = "mi_archivo.txt";
        var archivo = new File(nombreArchivos);

        try{
            if (archivo.exists()) {
                System.out.println("El archivo ya existe");
            } else {
                var salida = new PrintWriter(new FileWriter(archivo));

                // Se encarga de guardar el archivo
                salida.close();
                
                System.out.println("Se ha creado el arhivo");
            }
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
            e.printStackTrace(); // El detalle del error, muestra las lineas y las clases que generarn el error
        }
    }
}
