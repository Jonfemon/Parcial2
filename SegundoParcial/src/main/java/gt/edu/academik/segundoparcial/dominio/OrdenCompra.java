package gt.edu.academik.segundoparcial.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table (name = "Orden_Compra")
public class OrdenCompra implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    
    @Column (name = "orden_compra_id")
    private Integer ordenCompraId;
    
    @Column (name = "numero_orden")
    private String numeroOrden;
    
    @Column (name = "pedido_fecha")
    private Date pedidoFecha;
    
    @ManyToMany
    @JoinColumn( name = "proveedor_id",referencedColumnName = "proveedor_id")
    private Proveedor proveedor;
    
    @JoinColumn( name = "orden_compra_detalle_id",referencedColumnName = "orden_compra_detalle_id")
    private OrdenCompraDetalle ordenCompraDetalle;
    
    public  Integer getOrdenCompraId () {
        return ordenCompraId;
    }
    
    public void setOrdenCompraId (Integer ordenCompraId) {
        this.ordenCompraId = ordenCompraId;
    }
    
    public String getNumeroOrden (){
        return numeroOrden;
    }
    
    public void setNumeroOrdenId (String numeroOrden){
        this.numeroOrden = numeroOrden;
    }
    
    public Date getPedidoFecha (){
        return pedidoFecha;
    }
    
    public void setPedidoFecha (Date pedidoFecha){
        this.pedidoFecha = pedidoFecha;
    }
    
    public Proveedor getProveedor(){
        return proveedor;
    }
    
    public void setProveedor (Proveedor proveedor){
        this.proveedor = proveedor;
    }
    
    public OrdenCompraDetalle getOrdenCompraDetalle(){
        return ordenCompraDetalle;
    }
    
    public void setOrdenCompraDetalle (OrdenCompraDetalle ordenCompraDetalle){
         this.ordenCompraDetalle = ordenCompraDetalle;
    }
}

