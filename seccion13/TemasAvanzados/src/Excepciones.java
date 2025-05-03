public class Excepciones {
    public static void main(String[] args) {
        
        int valor1 = 10, valor2 = 0;

        try {
            var resultado = valor1 / valor2;
            System.out.println("resultado = " + resultado); // Arrija error en tiempo de ejecución
        }catch (Exception e){ // Exception clase padre de todas las excepciones            
            System.out.println("Ocurrio un error = " + e);
        }
        
        
    }
}
