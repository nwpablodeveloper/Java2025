public class TiposDatosParte1 {
    public static void main(String[] args) {
        // Tipos de datos en Java
        // Eneteros
        byte tipoByte = 127; // 8 bits
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000; // 16 bits
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647; // 32 bits
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // Forzamos con L o l para tipo Long - 64 bits
        System.out.println("tipoLong = " + tipoLong);

        // Punto flotante
        float tipoFloat = 3.14F; // Si no ponemos la "F" lo reconoce como tipo Double - 32 bits
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D; // Opcional  con D o d para indicar de tipo Double - 64 bits
    }
}
