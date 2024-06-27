
package pe.edu.upeu.modelo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author ADM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntitty {
    private int iduaurio;
    private String username;
    private String clave;
    private int estado;
    private int idempleado;
    private int idrol;
}
