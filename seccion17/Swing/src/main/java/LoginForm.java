import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;

public class LoginForm extends JFrame{
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public LoginForm(){
        inicializarForma();
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        FlatLaf tema = new FlatMacDarkLaf();
        try{
            UIManager.setLookAndFeel(tema);
        } catch (UnsupportedLookAndFeelException e) {
            System.out.println("Error al cargar el tema");
        }

        LoginForm forma = new LoginForm();
        forma.setVisible(true);
    }
}
