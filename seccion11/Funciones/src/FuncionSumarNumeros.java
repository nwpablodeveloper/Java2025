public class FuncionSumarNumeros {

    //Descripción: Sumar los números del 1 hasta n usando recursividad.
    //Ejemplo: suma(5) = 5 + 4 + 3 + 2 + 1 = 15

    static int sumarNumerosRecursiva(int numero){
        if (numero <= 1)
            return  1;
        else{
            return sumarNumerosRecursiva(numero - 1 )+ numero;
        }
    }

    public static void main(String[] args) {
        System.out.println(sumarNumerosRecursiva(5));
    }
}
