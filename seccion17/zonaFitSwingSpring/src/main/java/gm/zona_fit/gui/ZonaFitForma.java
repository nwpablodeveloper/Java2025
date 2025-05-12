package gm.zona_fit.gui;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

// Decirle a Spring que esto tambien es un componente para la fabrica de Spring
@Component
public class ZonaFitForma extends JFrame{

    // Atributos
    private JPanel panelPrincipal;
    private JTable clientesTabla;
    private JTextField nombreTexto;
    private JTextField apellidoTexto;
    private JTextField membresiaTexto;
    private JButton guardarButton;
    private JButton eliminarButton;
    private JButton limpiarButton;
    IClienteServicio clienteServicio;
    private DefaultTableModel tablaModeloClientes;

    // Inyectamos el servicio a utilizar (primero se crea la ventan y luego se inyecta el servicio)
    @Autowired
    public ZonaFitForma(IClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
        iniciarForma();
        guardarButton.addActionListener(e -> guardarCliente());
    }

    private void iniciarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    // Custom Create, es un metodo especial que se va a jecutar antes que el Constructor de nuestra Clase
    private void createUIComponents() {
        // TODO: place custom component creation code here
        this.tablaModeloClientes = new DefaultTableModel(0, 4); // 0 registros cargados, 4 columnas
        String[] cabeceros = {"Id", "Nombre", "Apellido", "Membresia"};
        this.tablaModeloClientes.setColumnIdentifiers(cabeceros);
        this.clientesTabla = new JTable(this.tablaModeloClientes);

        // Cargar listado de clientes
        listarClientes();
    }

    private void listarClientes(){
        this.tablaModeloClientes.setRowCount(0); // Iniciamos el conteo de registros
        List<Cliente> clientes = clienteServicio.listarClientes();

        clientes.forEach(cliente -> {
            // Creamos array para cada renglon
            Object[] renglonCliente = {
                    cliente.getId(),
                    cliente.getNombre(),
                    cliente.getApellido(),
                    cliente.getMembresia()
            };
            // Pasamos el r
            this.tablaModeloClientes.addRow(renglonCliente);
        });
    }

    private void guardarCliente(){
        if (nombreTexto.getText().equals("")){
            mostrarMensaje("Falta el nombre del Cliente");
            nombreTexto.requestFocusInWindow();
            return;
        }
        if (membresiaTexto.getText().equals("")) {
            mostrarMensaje("Falta la membresia del Cliente");
            membresiaTexto.requestFocusInWindow();
            return;
        }

        var nombre = nombreTexto.getText();
        var apellido = apellidoTexto.getText();
        var membresia = Integer.parseInt(membresiaTexto.getText());
        Cliente cliente = new Cliente(null, nombre,apellido,membresia);
        this.clienteServicio.guardarClientes(cliente);
        limpiarFormulario();
        listarClientes();
    }

    private void limpiarFormulario(){
        nombreTexto.setText("");
        nombreTexto.requestFocusInWindow();
        apellidoTexto.setText("");
        membresiaTexto.setText("");

    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this,mensaje, "Faltan datos", JOptionPane.INFORMATION_MESSAGE);

    }

}
