package aritmetica_encapsulamiento.aritmetica_paquete;

public class AritmeticaEncapsulamiento {
    private int operando1;
    private int operando2;
    public int operando3;

    public AritmeticaEncapsulamiento(int operando1, int operando2 ){
        // operando1 = operando1; // De esta manera estamos asignando el valor a la misma variable
        // operando2 = operando2;

        // Apunta al atributo y Objeto que se esta ejecutando
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Dirección Operador this: " + this);
    }

    public void sumar(){
        // Como no hay variables con el mismo nombre dentro del metodo, es opcional el operador THIS
        var resultado = this.operando1 + this.operando2;
        System.out.println("resultado = " + resultado);
    }

    public void restar(){
        // Como no hay variables con el mismo nombre dentro del metodo, es opcional el operador THIS
        var resultado = operando1 - operando2;
        System.out.println("resultado = " + resultado);
    }

    public int getOperando1(){
        return this.operando1;
    }

    public void setOperando1(int operando1){
        this.operando1 = operando1;
    }

    public int getOperando2(){
        return this.operando2;
    }

    public void setOperando2(int operando2){
        this.operando2 = operando2;
    }

}
