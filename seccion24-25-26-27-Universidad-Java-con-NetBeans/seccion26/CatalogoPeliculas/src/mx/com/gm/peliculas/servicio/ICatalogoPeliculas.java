package mx.com.gm.peliculas.servicio;

public interface ICatalogoPeliculas {
    // Como esta dentro de una interface java lo va a reconocer como una constante
    String NOMBRE_RECURSO = "peliculase.txt";
    
    void agregarPelicula(String nombrePelicula);
    void listarPeliculase();
    void buscarPelicula(String buscar);
    void iniciarCatalogoPeliculase();
    
    
}
