import javax.swing.*;

// Extendemos de la clase JFram para poder visualizar nuestro componente
public class Forma extends JFrame{

    private JPanel panel1;

    public static void main(String[] args) {
        Forma forma = new Forma();

        // Llamar al metodo para visualizar la App
        forma.setVisible(true);
    }

    public Forma(){
        inicializarForma();
    }

    private void inicializarForma(){
        // Nuestro panel es el 1er elemento que se debe establercer dentro de nuestro Formulario
        setContentPane(panel1);

        // Cuando el usuario cierra la ventana, va a finalizar nuestra App.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Indicar el tamaño de nuestra ventana
        setSize(600, 400);

        // Centrar nuestra ventana
        setLocationRelativeTo(null);
    }
}
