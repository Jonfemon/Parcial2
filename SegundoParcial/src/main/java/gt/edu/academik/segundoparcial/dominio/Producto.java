package gt.edu.academik.segundoparcial.dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "producto")
public class Producto implements Serializable{

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column (name = "producto_id")
    private Integer productoId;
    
    @Column (name = "codigo")
    private String codigo;
    
    @Column (name = "descripcion")
    private String descripcion;
    
    @Column (name = "activo")
    private boolean activo;
    
    @OneToMany (mappedBy = "producto")
    private List<OrdenCompraDetalle> OrdenCompraDetalleList;
    
    public Integer getProductoId(){
        return productoId;
    }
    
    public void setProductoId (Integer productoId){
        this.productoId = productoId;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void setCodigo (String codigo){
        this.codigo = codigo;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion (String descripcion){
        this.descripcion =descripcion;
    }
    
    public boolean getActivo(){
        return activo;
    }
    
    public void setActivo(boolean activo){
        this.activo =activo;
    }
    
    public List<OrdenCompraDetalle> getOrdenCompraDetalleList(){
        return OrdenCompraDetalleList;
    }
    
    public void setOrdenCompraDetalle (List<OrdenCompraDetalle>OrdenCompraDetalleList){
        this.OrdenCompraDetalleList = OrdenCompraDetalleList;
    }
    
}
