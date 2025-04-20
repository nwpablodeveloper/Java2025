public class NumerosPares {
    public static void main(String[] args) {

        var contador = 1;

        while (contador <= 20){
            if (contador %2 == 0)
                System.out.printf("%n%d\tEs par",contador);
            contador++;
        }

    }
}
