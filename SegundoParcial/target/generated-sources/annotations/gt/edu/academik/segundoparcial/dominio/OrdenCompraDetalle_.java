package gt.edu.academik.segundoparcial.dominio;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrdenCompraDetalle.class)
public abstract class OrdenCompraDetalle_ {

	public static volatile SingularAttribute<OrdenCompraDetalle, BigDecimal> precioCompra;
	public static volatile SingularAttribute<OrdenCompraDetalle, String> observaciones;
	public static volatile SingularAttribute<OrdenCompraDetalle, Integer> ordenCompraDetalleId;
	public static volatile SingularAttribute<OrdenCompraDetalle, Integer> cantidad;
	public static volatile SingularAttribute<OrdenCompraDetalle, Producto> producto;

	public static final String PRECIO_COMPRA = "precioCompra";
	public static final String OBSERVACIONES = "observaciones";
	public static final String ORDEN_COMPRA_DETALLE_ID = "ordenCompraDetalleId";
	public static final String CANTIDAD = "cantidad";
	public static final String PRODUCTO = "producto";

}

