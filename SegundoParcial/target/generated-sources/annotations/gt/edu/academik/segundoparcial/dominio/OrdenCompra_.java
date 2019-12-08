package gt.edu.academik.segundoparcial.dominio;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrdenCompra.class)
public abstract class OrdenCompra_ {

	public static volatile SingularAttribute<OrdenCompra, String> numeroOrden;
	public static volatile SingularAttribute<OrdenCompra, OrdenCompraDetalle> ordenCompraDetalle;
	public static volatile SingularAttribute<OrdenCompra, Integer> ordenCompraId;
	public static volatile SingularAttribute<OrdenCompra, Date> pedidoFecha;
	public static volatile SingularAttribute<OrdenCompra, Proveedor> proveedor;

	public static final String NUMERO_ORDEN = "numeroOrden";
	public static final String ORDEN_COMPRA_DETALLE = "ordenCompraDetalle";
	public static final String ORDEN_COMPRA_ID = "ordenCompraId";
	public static final String PEDIDO_FECHA = "pedidoFecha";
	public static final String PROVEEDOR = "proveedor";

}

