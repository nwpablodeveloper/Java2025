public class DetalleLibro {
    public static void main(String[] args) {
        // Detalle de un Libro
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        // Imprimir variables
        System.out.println("tituloLibro = " + tituloLibro);
        System.out.println("anioPublicacion = " + anioPublicacion);
        System.out.println("libroDisponible = " + libroDisponible);
        System.out.println("precio = " + precio);

        // Modificar el titulo
        tituloLibro = "El Señor de los Anillos";
        System.out.println("tituloLibro = " + tituloLibro);
        /*
            String es tipo de dato Object, cuando creamos un objeto estamos guardando en la memora Stack la dirección
            a la que apunta al objeto en la Memoria Heap.
            Cuando sobreescribimos al objeto estamos creando una nueva dirección de memoria la cual dicha dirección se
            almacenara en la memoria Stack para hacer referencia donde se guarda el objeto en la memoria Heap.
            El valor antiguo se queda sin referencia de memoria pero el OBJETO SIGUE EXISTIENDO para luego ser eliminad
            por el recolector de residuos
         */


    }
}
