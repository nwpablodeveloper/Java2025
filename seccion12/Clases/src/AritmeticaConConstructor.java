public class AritmeticaConConstructor {
    int operando1;
    int operando2;

    public AritmeticaConConstructor(){
        System.out.println("Ejecutando constructor");
    }

    public AritmeticaConConstructor(int op1, int op2 ){
        this.operando1 = op1;
        this.operando2 = op2;
    }

    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("resultado = " + resultado);
    }
    
    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("resultado = " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmética ***\n");

        // Se ejecuta el constructor que pude recibri parametros
        var aritmetica1 = new AritmeticaConConstructor(5, 7);
        aritmetica1.sumar();
        aritmetica1.restar();

        System.out.println();
        // Se ejecuta el constructor vacio
        var aritmetica2 = new AritmeticaConConstructor();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        aritmetica2.sumar();
        aritmetica2.restar();

    }
}
