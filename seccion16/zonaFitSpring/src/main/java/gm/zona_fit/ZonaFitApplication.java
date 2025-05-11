package gm.zona_fit;

import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	@Autowired
	private IClienteServicio clienteServicio;

	/*
		sirve para crear un objeto de tipo Logger, que se usa para registrar mensajes de
		log (registro o bitácora) en una aplicación.
	 */
	private static final Logger loger = LoggerFactory.getLogger(ZonaFitApplication.class);

	public static void main(String[] args) {

		loger.info("Iniciando la Appp");

		// Esta linea inicializa la fabrica de Spring, Carga todos los Objetos disponibles
		SpringApplication.run(ZonaFitApplication.class, args);

		loger.info("Aplicación Finalizada");
	}

	@Override
	public void run(String... args) throws Exception {
		loger.info("*** Aplicación Zona Fit (GYM) ***");
	}
}
