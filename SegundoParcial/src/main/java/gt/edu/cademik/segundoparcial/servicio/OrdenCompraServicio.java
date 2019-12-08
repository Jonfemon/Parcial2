package gt.edu.cademik.segundoparcial.servicio;

import gt.edu.academik.segundoparcial.dominio.OrdenCompra;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
/**
 *
 * @author diego
 */
public class OrdenCompraServicio {
    
    private final EntityManager em;
    
    public OrdenCompraServicio(EntityManager em) {
        this.em = em;
    }
}
