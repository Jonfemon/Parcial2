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
@Table(name = "proveedor")
public class Proveedor implements Serializable{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column (name = "proveedor_id")
private Integer proveedorId;

@Column (name = "codigo")
private Integer codigo;

@Column (name = "nombre")
private String nombre;

@OneToMany (mappedBy = "proveedor")
private List<OrdenCompra> OrdenCompraList;

public Integer getProveedorId(){
    return proveedorId;
}

public void setProveedorId (Integer proveedorId){
    this.proveedorId = proveedorId;
}

public Integer getCodigo(){
    return codigo;
}

public void setCodigo (Integer codigo){
    this.codigo = codigo;
}

public String getNombre(){
    return nombre;
}

public void setNombre (String nombre){
    this.nombre = nombre;
}

public List<OrdenCompra> getOrdenCompraList(){
    return OrdenCompraList;
}

public void setOrdenCompra(List<OrdenCompra>OrdenCompraList){
    this.OrdenCompraList =OrdenCompraList;
}
    
}
