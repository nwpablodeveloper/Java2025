package gm.zona_fit;

import gm.zona_fit.gui.ZonaFitForma;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class ZonaFitApp {

	public static void main(String[] args) {

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
}
