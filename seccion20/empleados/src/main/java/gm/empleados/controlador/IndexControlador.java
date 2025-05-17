package gm.empleados.controlador;

import gm.empleados.modelo.Empleado;
import gm.empleados.servicio.EmpleadoServicio;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexControlador {
    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    @Autowired
    private EmpleadoServicio empleadoServicio;

    // Procesar el URL, este metodo indica cual es la VISTA (el jsp con el que vamos a trabajar)
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String inciar(ModelMap modelo){ // Recibimos la vista
        List<Empleado> empleados = empleadoServicio.listarEmpleados();
//        empleados.forEach((empleado) -> logger.info(empleado.toString()));

        // Compartimos el modelo con la vista con una variable llamada empleados
        modelo.put("empleados", empleados);
        return "index";

    }

    @RequestMapping(value = "/agregar", method = RequestMethod.GET)
    public String mostrarAgregar(){
        return "agregar";
    }

    // @ModelAttribute("empleadoForma") es el modelAttribute de nuestro formulario en html (agregar.jsp)
    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public String agregarEmpleado(@ModelAttribute("empleadoForma") Empleado empleado){
        empleadoServicio.guardarEmpleado(empleado);
        logger.info("se agrega");
        return "redirect:/"; // Redirecciona al inicio
    }
}
