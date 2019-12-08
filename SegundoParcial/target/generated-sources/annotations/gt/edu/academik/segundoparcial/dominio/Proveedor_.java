package gt.edu.academik.segundoparcial.dominio;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Proveedor.class)
public abstract class Proveedor_ {

	public static volatile SingularAttribute<Proveedor, Integer> codigo;
	public static volatile ListAttribute<Proveedor, OrdenCompra> OrdenCompraList;
	public static volatile SingularAttribute<Proveedor, Integer> proveedorId;
	public static volatile SingularAttribute<Proveedor, String> nombre;

	public static final String CODIGO = "codigo";
	public static final String ORDEN_COMPRA_LIST = "OrdenCompraList";
	public static final String PROVEEDOR_ID = "proveedorId";
	public static final String NOMBRE = "nombre";

}

