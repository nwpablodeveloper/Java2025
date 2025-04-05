public class RetoGeneradorEmail {
    public static void main(String[] args) {
        // Retor generador de Eamil
        var nombreCompleto = "  Pablo Andés Veiga   ";
        var empresa = "  Trabajitos Playa    ";
        var dominio = "   com.ar  ";

        var usuarioNormalizado = nombreCompleto.toLowerCase().trim().replace(" ", ".");
        var empresaNormalizado = empresa.toLowerCase().trim().replace(" ", "");
        var dominioNormalizado = "." + dominio.toLowerCase().trim();
        var dominioEmail = "@" + empresaNormalizado + dominioNormalizado;

        var email = new StringBuilder();
        email.append(usuarioNormalizado).append(dominioEmail);

        System.out.println("*** Generador de Email ***");
        System.out.println("nombre de usuario: " + nombreCompleto);
        System.out.println("Usuario normalizado: " + usuarioNormalizado);
        System.out.println("\nNombre empresa: " + empresa.trim());
        System.out.println("Extensión del dominio: " + dominioNormalizado);
        System.out.println("Dominio de email normalizado: " + dominioEmail);
        System.out.println("\nEmail final generado: " + email.toString());

    }
}
