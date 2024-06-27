
package pe.edu.upeu.modelo.dao;

import java.util.List;
import pe.edu.upeu.modelo.dto.LoginDTO;

/**
 *
 * @author ADM
 */
public interface UsuarioDao {
    public List<LoginDTO> login(String username, String pass);
    
}
