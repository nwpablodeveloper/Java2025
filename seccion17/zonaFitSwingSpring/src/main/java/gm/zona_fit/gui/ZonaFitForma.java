package gm.zona_fit.gui;

import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

// Decirle a Spring que esto tambien es un componente para la fabrica de Spring
@Component
public class ZonaFitForma extends JFrame{

    // Atributos
    private JPanel panelPrincipal;
    IClienteServicio clienteServicio;

    // Inyectamos el servicio a utilizar (primero se crea la ventan y luego se inyecta el servicio)
    @Autowired
    public ZonaFitForma(IClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
    }


}
