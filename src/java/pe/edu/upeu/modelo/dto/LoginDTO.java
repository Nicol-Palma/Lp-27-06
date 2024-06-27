
package pe.edu.upeu.modelo.dto;

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
public class LoginDTO {
    private int idusuario;
    private String username;
    private String sexo;
    private String rol;
    private String menu;
    private String url;
    private String icon;
    
}
