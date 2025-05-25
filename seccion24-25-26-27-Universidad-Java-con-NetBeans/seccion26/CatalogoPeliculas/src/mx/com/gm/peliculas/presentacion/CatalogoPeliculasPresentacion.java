package mx.com.gm.peliculas.presentacion;

import java.util.Scanner;
import mx.com.gm.peliculas.servicio.CatalogoPeliculasImpl;
import mx.com.gm.peliculas.servicio.ICatalogoPeliculas;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        var opcion = -1;
        Scanner scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        
        while (opcion != 0) {            
            System.out.println("Elige una opción: \n"
                    + "1. Reiciar Catalogo de peliculas○\n"
                    + "2. Agregar Pelicula al archvio\n"
                    + "3. Mostrar lista de peliculas\n"
                    + "4. Buscar Pelicula\n"
                    + "0. Salir");
            
            try{
                opcion = Integer.parseInt(scanner.nextLine());
            }catch(Exception e){
                System.out.println("Error al ingresar la opción");
            }
            
            switch(opcion){
                case 1: 
                    catalogo.iniciarCatalogoPeliculase();
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la pelicula");
                    var nombre = scanner.nextLine();
                    catalogo.agregarPelicula(nombre);
                    break;
                case 3:
                    catalogo.listarPeliculase();
                    break;
                case 4:
                    System.out.println("Nombre de la pelicula a buscar");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    opcion = 0;
                    break;
                default:
                    System.out.println("Opción no valida");
                     
            }
            System.out.println("");
        }
        
        
    }
}
