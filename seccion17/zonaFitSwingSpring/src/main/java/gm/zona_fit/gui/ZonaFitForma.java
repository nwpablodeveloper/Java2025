package gm.zona_fit.gui;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
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
    private Integer idCliente;
    IClienteServicio clienteServicio;
    private DefaultTableModel tablaModeloClientes;

    // Inyectamos el servicio a utilizar (primero se crea la ventan y luego se inyecta el servicio)
    @Autowired
    public ZonaFitForma(IClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
        iniciarForma();
        guardarButton.addActionListener(e -> guardarCliente());
        nombreTexto.addActionListener(e -> guardarCliente());
        apellidoTexto.addActionListener(e -> guardarCliente());
        membresiaTexto.addActionListener(e -> guardarCliente());

        clientesTabla.getSelectionModel().addListSelectionListener(e -> {
            // Para evitar doble ejecución (evento de ajuste)
            if (!e.getValueIsAdjusting()) {
                cargarClienteSeleccionado();
            }
        });
        eliminarButton.addActionListener(e -> eliminarCliente());
        limpiarButton.addActionListener(e -> limpiarFormulario());
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
        // this.tablaModeloClientes = new DefaultTableModel(0, 4); // 0 registros cargados, 4 columnas

        // Evitamos la edición de las celdas en la tabla
        this.tablaModeloClientes = new DefaultTableModel(0, 4){ // 0 registros y 4 columnas
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };

        String[] cabeceros = {"Id", "Nombre", "Apellido", "Membresia"};
        this.tablaModeloClientes.setColumnIdentifiers(cabeceros);
        this.clientesTabla = new JTable(this.tablaModeloClientes);

        // Restringimos la selección de multiples renglones en la tabla
        this.clientesTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
        if (nombreTexto.getText().isEmpty()){
            mostrarMensaje("Falta el nombre del Cliente");
            nombreTexto.requestFocusInWindow();
            return;
        }
        if (membresiaTexto.getText().isEmpty()) {
            mostrarMensaje("Falta la membresia del Cliente");
            membresiaTexto.requestFocusInWindow();
            return;
        }

        // Capturamos los valores de los text y el idCliente si es que se pidio modificar
        Cliente cliente = new Cliente(
                this.idCliente,
                nombreTexto.getText(),
                apellidoTexto.getText(),
                Integer.parseInt(membresiaTexto.getText())
        );

        this.clienteServicio.guardarClientes(cliente); // Inserta o modifica, dependiendo el estado de idCliente
        limpiarFormulario();
        listarClientes();
        if (this.idCliente == null) {
            mostrarMensaje("Cliente registrado con exito:\n"
                    + "Nombre: " + cliente.getNombre() + ", " + cliente.getApellido() + "\n"
                    + "Membresia: " + cliente.getMembresia() + "\n");
        }else {
            mostrarMensaje("Cliente registrado con exito:\n"
                    + "Nombre: " + cliente.getNombre() + ", " + cliente.getApellido() + "\n"
                    + "Membresia: " + cliente.getMembresia() + "\n");
        }
    }

    private void cargarClienteSeleccionado(){
        // Si no se selecciono ningun registro va a regresar -1
        var renglon = clientesTabla.getSelectedRow();
        if (renglon != -1){
            var id = clientesTabla.getModel().getValueAt(renglon,0).toString();
            this.idCliente = Integer.parseInt(id);

            var nombre = clientesTabla.getModel().getValueAt(renglon,1).toString();
            this.nombreTexto.setText(nombre);

            var apellido = clientesTabla.getModel().getValueAt(renglon,2).toString();
            this.apellidoTexto.setText(apellido);

            var membresia = clientesTabla.getModel().getValueAt(renglon,3).toString();
            this.membresiaTexto.setText(membresia);

            nombreTexto.setText(nombre);
        }
    }

    private void eliminarCliente(){
        var renglon = this.clientesTabla.getSelectedRow();
        if (renglon != -1){
            var idClienteStr = clientesTabla.getModel().getValueAt(renglon,0).toString();
            this.idCliente = Integer.parseInt(idClienteStr);
            Cliente cliente = new Cliente();
            cliente.setId(this.idCliente);
            clienteServicio.eliminarCliente(cliente);
            limpiarFormulario();
            listarClientes();
            mostrarMensaje("Cliente eliminado");

        }else
            mostrarMensaje("No hay clientes seleccionados por eliminar");


        // Mi solución
//        if (this.idCliente == null){
//            mostrarMensaje("No hay clientes seleccionados por eliminar");
//        }else{
//            Cliente cliente = new Cliente();
//            cliente.setId(this.idCliente);
//            clienteServicio.eliminarCliente(cliente);
//            limpiarFormulario();
//            listarClientes();
//            mostrarMensaje("Cliente eliminado");
//        }
    }

    private void limpiarFormulario(){

        // Si no es Null, entonces se va actualizar el id que quedo cargado
        this.idCliente = null;

        nombreTexto.setText("");
        nombreTexto.requestFocusInWindow();
        apellidoTexto.setText("");
        membresiaTexto.setText("");

        // Deselecionamos el registro seleccionado de la tabla
        this.clientesTabla.getSelectionModel().clearSelection();

    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this,mensaje, "Faltan datos", JOptionPane.INFORMATION_MESSAGE);

    }

}
