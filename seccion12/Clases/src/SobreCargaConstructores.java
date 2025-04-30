public class SobreCargaConstructores {
    int operando1;
    int operando2;

    // Sobre carga de constructores por que ya hay mas de 1
    public SobreCargaConstructores() {
        System.out.println("\nEjecutando constructor SIN argumentos");
    }

    public SobreCargaConstructores(int op1, int op2 ){
        System.out.println("\nEjecutando constructor CON arguemnteso");
        operando1 = op1;
        operando2 = op2;
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

        // Se ejecuta el constructor que pude recibir argumentos
        var aritmetica1 = new SobreCargaConstructores(5, 7);
        aritmetica1.sumar();
        aritmetica1.restar();

        /*
            Ya no se crea el contructor vacio de forma automatica debido a que
            existe un constructor con argumentos
        */
        var aritmetica2 = new SobreCargaConstructores();
        aritmetica2.sumar();
        aritmetica2.operando1 = 15;
        aritmetica2.operando2 = 7;
        aritmetica2.restar();
        aritmetica2.sumar();
        aritmetica2.restar();


    }
}
