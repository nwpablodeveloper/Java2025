package gm.zona_fit.repositorio;

import gm.zona_fit.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

// Esta Interface es para hacer un CRUD, funcion que antes haciamos con una clase DAO

/*
    Extiende de la Interface JpaRepository y le indicamos el tipo de dato de objetos con la que vamos
    a trabajar y el tipo de dato de la llave primaria.
 */

public interface IClienteRepositorio extends JpaRepository<Cliente, Integer> {
}
