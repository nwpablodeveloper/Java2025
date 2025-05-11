package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	@Autowired
	private IClienteServicio clienteServicio;

	/*
		sirve para crear un objeto de tipo Logger, que se usa para registrar mensajes de
		log (registro o bitácora) en una aplicación.
	 */
	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

	private String nl = System.lineSeparator(); // Obtener caracter de Salto de llinea

	public static void main(String[] args) {

		logger.info("Iniciando la Appp");

		// Esta linea inicializa la fabrica de Spring, Carga todos los Objetos disponibles
		SpringApplication.run(ZonaFitApplication.class, args);

		logger.info("Aplicación Finalizada");
	}

	@Override
	public void run(String... args) throws Exception {
		zonaFitApp();
	}

	private void zonaFitApp(){
		boolean salir = false;
		Scanner consola = new Scanner(System.in);

		while (!salir){
			int opcion = mostrarMenu(consola);
			salir = ejecutarOpcion(opcion, consola);
			logger.info(nl);
		}

		System.out.println("App Cerrada");
	}

	private boolean ejecutarOpcion(int opcion, Scanner consola){
		switch (opcion){
			case 1 -> {
				logger.info(nl + "--- Listado de Clientes ---" + nl);
				List<Cliente> clientes = clienteServicio.listarClientes();
				if(clientes.isEmpty())
					logger.info("No hay Clientes Registrados");
				else
					clientes.forEach(cliente -> logger.info(cliente.toString() + nl));
			}
			case 2 -> {
				logger.info(nl + "--- Buscar Cliente por ID ---" + nl);
				logger.info("Id del cliente a buscar: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
				if (cliente == null)
					logger.info("No se econtro el cliente de ID: " + idCliente);
				else
					logger.info(cliente + nl);
			}
			case 3 -> {
				logger.info("--- Agregar Cliente --- " +nl);
				logger.info("Nombre: ");
				var nombre = consola.nextLine();
				logger.info("Apellido: ");
				String apellido = consola.nextLine();
				logger.info("Membresia: ");
				int membresia = Integer.parseInt(consola.nextLine());
				Cliente cliente = new Cliente();
				cliente.setNombre(nombre);
				cliente.setApellido(apellido);
				cliente.setMembresia(membresia);
				try{
					clienteServicio.guardarCliente(cliente);
					logger.info("Cliente agregado: " + cliente + nl);
				} catch (RuntimeException e) {
					logger.error(e.getMessage());
				}
			}
			case 4 -> {
				logger.info("--- Modificar Clientes ---" + nl);
				logger.info("ID Cliente? ");
				var idCliente = Integer.parseInt(consola.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);
				if (cliente != null) {
					logger.info(cliente.toString() + nl);
					logger.info("Nombre: ");
					cliente.setNombre(consola.nextLine());
					logger.info("Apellido: ");
					cliente.setApellido(consola.nextLine());
					logger.info("Membresia: ");
					cliente.setMembresia(Integer.parseInt(consola.nextLine()));
					clienteServicio.guardarCliente(cliente);
				}else
					logger.info("Cliente no encontrado");
			}
			case 5 -> {
				logger.info("--- Eliminar Cliente ---" + nl);
				logger.info("Id Cliente: ");
				var idCliente = Integer.parseInt(consola.nextLine());
				var cliente = clienteServicio.buscarClientePorId(idCliente);
				if (cliente != null){
					logger.info(cliente.toString());
					clienteServicio.eliminarCliente(cliente);
					logger.info("\nCliente eliminado");
				}else
					logger.info("No se encontro cliente por id");
			}
			case 6 -> {
				System.out.println("Saliendo de la App...");
				return true;
			}
			default -> logger.error("Opción no valida");
		}
		return false;
	}

	private int mostrarMenu(Scanner consola){
		logger.info("""
		\n*** Aplicación Zona Fit (GYM) ***
		1. Listar Clientes
		2. Buscar Cliente
		3. Agregar Cliente
		4. Modificar Cliente
		5. Elinar Cliente
		6: Salir
		Elige una opción:\s""");
		return Integer.parseInt(consola.nextLine());
	}
}
