import com.formdev.flatlaf.*;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

// Extendemos de la clase JFram para poder visualizar nuestro componente
public class Forma extends JFrame{

    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public static void main(String[] args) {

        // Cambiar el estilo de la App, debe de estar al principio del Main
        FlatLaf tema = new FlatMacDarkLaf();

        try{
            UIManager.setLookAndFeel(tema);
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println("Error al cargar la aparicencia");
        }

        Forma forma = new Forma();

        // Llamar al metodo para visualizar la App
        forma.setVisible(true);

    }

    public Forma(){
        inicializarForma();

        // Al dispara con Enter
//        campoTexto.addActionListener(e -> {
//            replicarTexto();
//        });

        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
    }

    private void inicializarForma(){

        // Nuestro panel es el 1er elemento que se debe establercer dentro de nuestro Formulario
        setContentPane(panelPrincipal);

        // Cuando el usuario cierra la ventana, va a finalizar nuestra App.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Indicar el tamaño de nuestra ventana
        setSize(600, 400);

        // Centrar nuestra ventana
        setLocationRelativeTo(null);
    }

    private void replicarTexto(){
        this.replicadorLabel.setText(this.campoTexto.getText());
    }
}
