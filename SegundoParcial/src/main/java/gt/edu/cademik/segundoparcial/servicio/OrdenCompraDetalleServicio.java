package gt.edu.cademik.segundoparcial.servicio;

import gt.edu.academik.segundoparcial.dominio.OrdenCompraDetalle;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
/**
 *
 * @author diego
 */
public class OrdenCompraDetalleServicio {
    
    private final EntityManager em;
    
    public OrdenCompraDetalleServicio (EntityManager em) {
        this.em = em;
    }
    
}
