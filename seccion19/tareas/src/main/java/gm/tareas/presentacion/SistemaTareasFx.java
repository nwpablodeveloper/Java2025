package gm.tareas.presentacion;

import gm.tareas.TareasApplication;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

// Application extiende de javafx
// Esta clase se encarga de Vincular JavaFx con Spring
public class SistemaTareasFx extends Application {

    // importamos la fabrica de Spring
    private ConfigurableApplicationContext applicationContext;

//     Si ejecutamos este main NO integramos Spring
//    Vamos a usar nuestro Main que esta en: TareasApplication
//    public static void main(String[] args) {
//        launch(args);
//    }

    @Override
    // El metodo init() es un metodo que se ejecuta antes del metodo start()
    public void init(){
        // Instanciamos la fabrica de Spring
        // Para que luego ejecute nuestra clase de inicio de la App
        this.applicationContext = new SpringApplicationBuilder(TareasApplication.class).run();
    }

    // Luego de ejecutarse el init() se va a ejecutar el start()
    // El metodo start nos va permitir inicializar la App de JavaFx (index.fxml)
    @Override
    // Recibimos el Escenario como argumento
    public void start(Stage stage) throws Exception {

        // Cargamos en memoria nuestra interface grafica (la Escena) index.fxml
        FXMLLoader loader = new FXMLLoader(TareasApplication.class.getResource("/templates/index.fxml"));

        // Fabrica de Objetos de tipo controlador
        // getBean es el metodo de referencia para proporcionar todos los Objetos de Spring
        loader.setControllerFactory(applicationContext::getBean); // Se estan integrando las tecnoloigas de javafx con spring

        // Instanciamos la Escena
        Scene escena = new Scene(loader.load());

        // Establecemos la escena que creamos
        stage.setScene(escena);

        // Mostramos la escena
        stage.show();
    }
}
