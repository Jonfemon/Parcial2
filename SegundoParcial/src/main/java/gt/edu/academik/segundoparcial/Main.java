package gt.edu.academik.segundoparcial;

import gt.edu.academik.segundoparcial.dominio.Proveedor;
import gt.edu.academik.segundoparcial.dominio.Producto;
import gt.edu.academik.segundoparcial.dominio.OrdenCompra;
import gt.edu.academik.segundoparcial.dominio.OrdenCompraDetalle;
import gt.edu.cademik.segundoparcial.servicio.ProveedorServicio;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[]args){
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SegundoParcial");
        EntityManager em = emf.createEntityManager();
        
        ProveedorServicio proveedorServicio = new ProveedorServicio(em);
        List<Proveedor> proveedorList = proveedorServicio.findAllWithCriteria();
        proveedorList.stream().forEach(p -> System.out.println(p.getNombre()));
        
        
        em.close();
        emf.close();
    }
}
