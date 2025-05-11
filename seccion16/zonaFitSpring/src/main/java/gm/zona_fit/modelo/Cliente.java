package gm.zona_fit.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


@Entity                 // Usando JPA para definir nuestra clase de Entidad
@Data                   // Genera los metodos Get y Set de cada atributo privado
@NoArgsConstructor      // Generar constructor vacio
@AllArgsConstructor     // Generar el constructor con todos los argumentos
@ToString               // Metodo toString
@EqualsAndHashCode      // Metodos equals y hashcode
public class Cliente {

    @Id     // Definicion de atributos
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indicar que es la llave primaria en la DB
    private Integer id; // Integer, para trabajar con el objeto y no con primitivo (tenemos null)
    private String nombre;
    private String apellido;
    private Integer membresia;
}
