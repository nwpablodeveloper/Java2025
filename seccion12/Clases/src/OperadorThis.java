public class OperadorThis {
    int operando1;
    int operando2;

    public OperadorThis(int operando1, int operando2 ){
        System.out.println("\nEjecutando constructor CON arguemnteso");
        // operando1 = operando1; // De esta manera estamos asignando el valor a la misma variable
        // operando2 = operando2;

        // Apunta al atributo y Objeto que se esta ejecutando
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Dirección Operador this: " + this);
    }

    void sumar(){
        // Como no hay variables con el mismo nombre dentro del metodo, es opcional el operador THIS
        var resultado = this.operando1 + this.operando2;
        System.out.println("resultado = " + resultado);
    }
    
    void restar(){
        // Como no hay variables con el mismo nombre dentro del metodo, es opcional el operador THIS
        var resultado = operando1 - operando2;
        System.out.println("resultado = " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("*** Ejemplo Aritmética ***");

        var aritmetica1 = new OperadorThis(5, 7);
        aritmetica1.sumar();
        aritmetica1.restar();
        System.out.println("Dirección de memoria 1ritmetica1: " + aritmetica1);

        // Creamos un segundo objeto
        var aritmetica2 = new OperadorThis(8,50);
        aritmetica2.sumar();
        aritmetica2.restar();
        System.out.println("Dirección de memoria 1ritmetica2: " + aritmetica2);

    }
}
