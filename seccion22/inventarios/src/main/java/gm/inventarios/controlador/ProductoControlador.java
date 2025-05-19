package gm.inventarios.controlador;

import gm.inventarios.modelo.Producto;
import gm.inventarios.servicio.ProductoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inventario-app") // http://localhost:port/inventario-app
@CrossOrigin(value ="http://localhost:4200") // Puerto por defecto de Angular
public class ProductoControlador {

    private static final Logger logger = LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping("/productos") // http://localhost:port/inventario-app/productos
    public List<Producto> obtenerProductos(){
        List<Producto> productos = productoServicio.listarProductos();
        productos.forEach((producto) -> logger.info(producto.toString()));
        return productos;
    }

    @PostMapping("/productos")
    public Producto agregarProducto(@RequestBody Producto producto){ // @RequestBody recibe la información y la guarda en el objeto
        logger.info("Producto a agregar: " + producto);
        return productoServicio.guardarProducto(producto);
    }

}
