public class GeneradorEmails {
    public static void main(String[] args) {
        System.out.println("*** Generador de Emails ***");
        // Nombre completo
        var nombreCompleto = "   Pablo Andres Veiga   ";
        System.out.println("nombreCompleto = " + nombreCompleto);

        // Procesar o normalizar el nombre del usuario
        // Limpiar espacios al principio y al final
        var nombreNormalizado = nombreCompleto.strip();
        // Reemplazar espacios por puntos
        nombreNormalizado = nombreNormalizado.replace(" ",".");
        // convertir a minusculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);
        
        // Datos de la empres
        var nombreEmpresa = "  Global mentoring";
        System.out.println("\nnombreEmpresa = " + nombreEmpresa);
        var extensionDominio = ".com.mx";
        System.out.println("Extension dominio: "  +extensionDominio);

        // Quitmaos los epacios en blancos y convertimos a minustuclas
        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ",".").toLowerCase();
        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);
        
        // Creamos el email final
        var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;
        System.out.println("\nemailNormalizado = " + emailNormalizado);
    }
}
