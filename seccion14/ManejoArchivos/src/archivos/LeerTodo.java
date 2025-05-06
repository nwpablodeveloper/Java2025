package archivos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";

        try{

            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));

            System.out.println("Contenido del archivo: ");
            lineas.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error al leer todo el archivo: " + e.getMessage());
            e.printStackTrace();
        }


    }
}
