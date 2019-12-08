package gt.edu.academik.segundoparcial.dominio;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Producto.class)
public abstract class Producto_ {

	public static volatile SingularAttribute<Producto, String> descripcion;
	public static volatile SingularAttribute<Producto, String> codigo;
	public static volatile ListAttribute<Producto, OrdenCompraDetalle> OrdenCompraDetalleList;
	public static volatile SingularAttribute<Producto, Integer> productoId;
	public static volatile SingularAttribute<Producto, Boolean> activo;

	public static final String DESCRIPCION = "descripcion";
	public static final String CODIGO = "codigo";
	public static final String ORDEN_COMPRA_DETALLE_LIST = "OrdenCompraDetalleList";
	public static final String PRODUCTO_ID = "productoId";
	public static final String ACTIVO = "activo";

}

