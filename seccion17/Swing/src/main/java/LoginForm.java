import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public LoginForm(){
        inicializarForma();
        enviarBoton.addActionListener(e -> validar());
        usuarioTexto.addActionListener(e -> validar());
        passwordTexto.addActionListener(e -> validar());
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

    private void validar(){
        // Leer los valores
        var usuario = this.usuarioTexto.getText();

        // getPasswor devuelve un Array de caracteres, hay que convertirlo a un Objeto String
        var password = new String(this.passwordTexto.getPassword());

        if ("root".equals(usuario) && "admin".equals(password))
            mostrarMensaje("Datos correctos, bienvenido!");
        else if("root".equals(usuario))
            mostrarMensaje("Password no valido");
        else
            mostrarMensaje("Usuario no valido");

    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this,mensaje);

    }
}
