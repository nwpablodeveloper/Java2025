package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        try {
            var resultado = Aritmetica.division(5,0);
            System.out.println("resultado = " + resultado);
            
        }catch (Exception e){
            System.out.println("e = " + e);
        }finally {
            System.out.println("Se reviso la división entre cero");
        }

    }
}
