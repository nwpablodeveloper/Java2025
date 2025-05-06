package archivos;

import java.io.*;

public class LeerArchivo {
    public static void main(String[] args) {
        // Leer el arhcivo
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);

        try {
            System.out.println("Contenido del arhcivo");
            var entrada = new BufferedReader(new FileReader(archivo));

            try{
                // Leer linea a linea el arhivo
                var linea = entrada.readLine();

                while (linea != null){
                    System.out.println(linea);

                    // Pasar a la siguiente linea
                    linea = entrada.readLine();
                }
                // cerrar el Buffer
                entrada.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }catch (FileNotFoundException e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
