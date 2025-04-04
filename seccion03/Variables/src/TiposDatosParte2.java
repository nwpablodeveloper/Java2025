public class TiposDatosParte2 {
    public static void main(String[] args) {
        // Tipos de datos en Java
        // TIPOS ENTEROS, (su valor por defautl es 0)
        byte tipoByte = 127; // 8 bits
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000; // 16 bits
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647; // 32 bits
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // Forzamos con L o l para tipo Long - 64 bits
        System.out.println("tipoLong = " + tipoLong);

        // TIPOS PUNTO FLOTANTE (Su valor default es 0.0)
        float tipoFloat = 3.14F; // Si no ponemos la "F" lo reconoce como tipo Double - 32 bits
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // Opcional  con D o d para indicar de tipo Double - 64 bits

        // TIPO CARACTER, ('\u0000' su valor default)
        char tipoChar = 'A'; // Caracteres del juego "UNICODE"
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65; // Valor UNICODE del caracter A
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);
        
        // TIPO BOOLEANO, (false, su valor default)
        boolean tipoBoolean = true; // solo permite 2 valores, true/false
        System.out.println("tipoBoolean = " + tipoBoolean);

        // TIPO Object o referencia
        String nombre = null; // (null, su valor default
        System.out.println("nombre = " + nombre);
        nombre = "Pablo";
        System.out.println("nombre = " + nombre);
    }
}
