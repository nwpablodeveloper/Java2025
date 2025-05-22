package mundopc;

import mx.com.gm.mundopc.Computadora;
import mx.com.gm.mundopc.Monitor;
import mx.com.gm.mundopc.Orden;
import mx.com.gm.mundopc.Raton;
import mx.com.gm.mundopc.Teclado;

public class MundoPc {
    public static void main(String[] args) {
        
        // Monitores
        Monitor monitor1 = new Monitor("Samsung", 27.5);
        Monitor monitor2 = new Monitor("Lg", 20.3);
        Monitor monitor3 = new Monitor("Keep", 27);
        
        // Perifericos
        Raton raton1 = new Raton("Usb", "Genius");
        Raton raton2 = new Raton("BlueTooth", "mars");
        Raton raton3 = new Raton("inalambrico", "forgeon");
        
        Teclado teclado1 = new Teclado("usb", "genius");
        Teclado teclado2 = new Teclado("BlueTooth", "mars");
        Teclado teclado3 = new Teclado("inalambrico", "forgeon");
        
        // Computadoras
        Computadora computadora1 = new Computadora("Basica",
                monitor1, teclado1, raton1);
        Computadora computadora2 = new Computadora("Gamer",
                monitor2, teclado2, raton2);
        Computadora computadora3 = new Computadora("Voladora",
                monitor3, teclado3, raton3);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
        
    }
}
