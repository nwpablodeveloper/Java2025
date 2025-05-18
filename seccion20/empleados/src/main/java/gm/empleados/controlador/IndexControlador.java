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
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class IndexControlador {
    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    @Autowired
    private EmpleadoServicio empleadoServicio;
    private Integer idEmpleado;

    // Procesar el URL, este metodo indica cual es la VISTA (el jsp con el que vamos a trabajar)
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String inciar(ModelMap modelo){ // Recibimos la vista
        List<Empleado> empleados = empleadoServicio.listarEmpleados();
//        empleados.forEach((empleado) -> logger.info(empleado.toString()));

        // Compartimos el modelo con la vista con una variable llamada empleados
        modelo.put("empleados", empleados);
        return "index";

    }

    // Se dispara este metodo al acceder a la url /agregar
    @RequestMapping(value = "/agregar", method = RequestMethod.GET)
    public String mostrarAgregar(){
        return "agregar";
    }

    // @ModelAttribute("empleadoForma") es el modelAttribute de nuestro formulario en html (agregar.jsp)
    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public String agregarEmpleado(@ModelAttribute("empleadoForma") Empleado empleado){
        empleadoServicio.guardarEmpleado(empleado);
        logger.info("se agrega" + empleado);
        return "redirect:/"; // Redirecciona al inicio
    }

    // carga datos el empleado a editar en la vista
    @RequestMapping(value = "/editar", method = RequestMethod.GET)
    public String mostrarEditar(@RequestParam int idEmpleado, ModelMap modelo){ // Recibimos los nombres de los parametros
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(idEmpleado);
        this.idEmpleado = empleado.getIdEmpleado(); // conservo el id
        logger.info("Empleado a editar: " + empleado);
        modelo.put("empleado", empleado);
        return "editar";
    }

    // Guarda los cambios en el usuario editado
    @RequestMapping(value = "/editar", method = RequestMethod.POST)
    public String editar(@ModelAttribute("empleadoForma") Empleado empleado){
        empleado.setIdEmpleado(this.idEmpleado); // cargo el id que conserve
        logger.info("Empleado a guardar: " + empleado);
        empleadoServicio.guardarEmpleado(empleado);
        return "redirect:/"; // redirigimos al inicio
    }


}
