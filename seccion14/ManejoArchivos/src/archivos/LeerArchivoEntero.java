package archivos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerArchivoEntero {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";

        try{
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));

//            Interar normal
//            for (String linea : lineas){
//                System.out.println(linea);
//            }

            // Función Lambda
            lineas.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error al leer todo el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
