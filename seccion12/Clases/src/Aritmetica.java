public class Aritmetica {
    int operando1;
    int operando2;

    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("resultado = " + resultado);
    }
    
    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("resultado = " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmética ***");
        var aritmetica1 = new Aritmetica();
        aritmetica1.operando1 = 5;
        aritmetica1.operando2 = 7;
        aritmetica1.sumar();
        aritmetica1.restar();

        var aritmetica2 = new Aritmetica();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        aritmetica2.sumar();
        aritmetica2.restar();

    }
}
