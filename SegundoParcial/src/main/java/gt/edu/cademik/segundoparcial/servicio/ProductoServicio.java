package gt.edu.cademik.segundoparcial.servicio;

import gt.edu.academik.segundoparcial.dominio.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
/**
 *
 * @author diego
 */
public class ProductoServicio {
    
    private final EntityManager em;
    
    public ProductoServicio (EntityManager em) {
        this.em =em;
    }
    
}
