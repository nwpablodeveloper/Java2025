package gm.zona_fit;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import gm.zona_fit.gui.ZonaFitForma;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class ZonaFitApp {

	public static void main(String[] args) {
		tema();

		// Instanciar la fabrica de Spring
		ConfigurableApplicationContext contextoSpring =
				new SpringApplicationBuilder(ZonaFitApp.class)
						.headless(false)					// headless (por que no es una App web)
						.web(WebApplicationType.NONE)		// web (no es app web)
						.run(args);							// run (para recibir los Argumentos en este metodo main)

		// Crear un Objeto de Swing
		// Ejecutamos la App de Swing de manera indirecta
		// Se va a ejecutar luego de que Spring inicialice todos los Objetos disponibles
		SwingUtilities.invokeLater(() -> {
			ZonaFitForma zonaFitForma = contextoSpring.getBean(ZonaFitForma.class);
			zonaFitForma.setVisible(true);
		});
	}

	public static void tema(){
		FlatLaf tema = new FlatDarculaLaf();
		try{
			UIManager.setLookAndFeel(tema);
		} catch (UnsupportedLookAndFeelException e) {
			System.out.println("Error al iniciar el tema");
        }
    }
}
