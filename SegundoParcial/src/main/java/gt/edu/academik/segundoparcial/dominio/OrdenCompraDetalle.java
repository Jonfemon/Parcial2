package gt.edu.academik.segundoparcial.dominio;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table (name = "Orden_Compra_Detalle")
public class OrdenCompraDetalle implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column (name= "orden_compra_detalle_id")
    private Integer ordenCompraDetalleId;
    
    @Column (name = "cantidad")
    private Integer cantidad;
    
    @Column (name = "precio_compra")
    private BigDecimal precioCompra;
    
    @Column (name = "observaciones")
    private String observaciones;
    
    @ManyToOne
    @JoinColumn (name = "producto_id", referencedColumnName = "producto_id")
    private Producto producto;
    
    public Integer getOrdenCompraDetalleId(){
        return ordenCompraDetalleId;
    }
    
    public void setOrdenCompraDetalleId (Integer ordenCompraDetalleId){
        this.ordenCompraDetalleId =ordenCompraDetalleId;
    }
    
    public Integer getCantidad(){
        return cantidad;
    }
    
    public void setCantidad (Integer cantidad){
        this.cantidad = cantidad;
    }
    
    public BigDecimal getPrecioCompra(){
        return precioCompra;
    }
    
    public void setPrecioCompra(BigDecimal precioCompra){
        this.precioCompra =precioCompra;
    }
    
    public String getObservaciones(){
        return observaciones;
    }
    
    public void setObservaciones (String observaciones){
        this.observaciones = observaciones;
    }
    
    public Producto getProducto(){
        return producto;
    }
    
    public void setProducto(Producto producto){
        this.producto=producto;
    }
}
