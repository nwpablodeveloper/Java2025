package gm.rh.controlador;

import gm.rh.excepcion.RecursoNoEncontradoExcepcion;
import gm.rh.modelo.Empleado;
import gm.rh.servicio.IEmpleadoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rh-app") //dominio/rh-app
@CrossOrigin(value = "http://localhost:3000") // Puerto del Front-End
public class EmpleadoControlador {
    private static final Logger logger = LoggerFactory.getLogger(EmpleadoControlador.class);

    @Autowired
    private IEmpleadoServicio empleadoServicio;

    @GetMapping("/empleados")
    public List<Empleado> obtenerEmpleados(){
        List<Empleado> empleados = empleadoServicio.listarEmpleados();
//        empleados.forEach((empleado -> logger.info("Obtener empleados: " + empleado.toString())));
        return empleadoServicio.listarEmpleados();
    }

    @PostMapping("/empleados")
    public Empleado agregarEmpleado(@RequestBody Empleado empleado){
        logger.info("Empleado a agregar: " + empleado.toString());
        return empleado;
    }

    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable Integer id){
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado == null)
            throw new RecursoNoEncontradoExcepcion("No se encontro por id: " + id);
        return ResponseEntity.ok(empleado);

    }

}
