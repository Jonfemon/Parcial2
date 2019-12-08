package gt.edu.cademik.segundoparcial.servicio;

import gt.edu.academik.segundoparcial.dominio.Proveedor;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
/**
 *
 * @author diego
 */
public class ProveedorServicio {
    
    private final EntityManager em;
    
    public ProveedorServicio (EntityManager em) {
        this.em=em;
    }
    
    
    public List<Proveedor>findAllWithJPQL (){
        List<Proveedor> proveedor = this.em.createQuery("Select m From Proveedor AS m").getResultList();
        return proveedorList;
    }   
}
