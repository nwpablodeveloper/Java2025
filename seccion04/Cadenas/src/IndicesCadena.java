public class IndicesCadena {
    public static void main(String[] args) {
        // Menejo de indices en una cadena
        var cadena1 = "Hola Mundo";
        
        // Recuperar el 1er caracter de una cadena
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);

        // Recuperar el ultimo caracter en la posición 9
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        
        // Recuperar el ultimo caracter en la posición 5
        var letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);
        
        
    }
}
