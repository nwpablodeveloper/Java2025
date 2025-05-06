package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        boolean anexar = false;

        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try {
            // Revisar si existe el archivo
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(nombreArchivo, anexar));

            var neuvoContendio = "Nuevo\ncontenido\n\tcon formato";
            neuvoContendio += """
                    \n\nAgregando más
                    contenido con otro formato:\s""";
            
            salida.println(neuvoContendio);

            // Ejecuta la solicitud
            salida.close();

        } catch (IOException e) {
            System.out.println("Error al anexar el contenido: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
