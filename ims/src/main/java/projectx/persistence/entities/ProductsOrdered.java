package projectx.persistence.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamedQueries({

	@NamedQuery (name = ProductsOrdered.INSERT_ORDEREDPRODUCTS, query = "INSERT INTO OrderedProducts (id,product,ammountOrdered) VALUES (:id, :product, :ammountOrdered)"),
	@NamedQuery (name=ProductsOrdered.FIND_ALL,query = "SELECT * FROM OrderedProducts"),
	@NamedQuery (name = ProductsOrdered.FIND_BY_PRODUCT,query = "SELECT * FROM OrderedProducts o where o.productId=:productId"),
	@NamedQuery (name = ProductsOrdered.FIND_BY_ID,query = "SELECT * FROM OrderedProducts o where o.id=:id"),
	@NamedQuery (name = ProductsOrdered.UPDATE_ORDEREDPRODUCTS,query = "UPDATE OrderedProducts o SET o.productId=:newProductId , o.ammountOrdered=:newAmooutnOrdered  WHERE o.id=:newId,"),
})

@Entity
@Table(name = "OrderedProducts")
public class ProductsOrdered {
	public static final String INSERT_ORDEREDPRODUCTS = "ProductsOrdered.saveProductsOrdered";
	public static final String FIND_ALL = "ProductsOrdered.findAll";
	public static final String FIND_BY_PRODUCT="ProductsOrdered.findByProduct";
	public static final String FIND_BY_ID="ProductsOrdered.findById";
	public static final String UPDATE_ORDEREDPRODUCTS = "ProductsOrdered.updatePurchaseOrder";
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn (name = "productId", nullable=false, updatable=false)
	private  Product product;
	
	@Column(name = "ammountOrdered", nullable = false)
	private int ordered;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "purchaseOrderId", nullable = false)
	@NotNull
	private PurchaseOrder purchaseOrderId;
	
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param nproduct
	 * @param nOrdered
	 * @param npurchaseOrderId
	 */
	
	public ProductsOrdered(int id, Product nProduct, int nOrdered,PurchaseOrder npurchaseOrderId) {
		setId(id);
		setProduct(nProduct);
		setAmmountOrdered(nOrdered);
		setPurchaseOrderId(npurchaseOrderId);
	}

	public PurchaseOrder getPurchaseOrderId() {
		return purchaseOrderId;
	}

	public void setPurchaseOrderId(PurchaseOrder purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	private void setAmmountOrdered(int nOrdered) {
		this.ordered=nOrdered;
		
	}

	private void setProduct(Product nProduct) {
		this.product=nProduct;
		
	}

	private void setId(int id) {
		this.id=id;
		
	}
	
	public int getId() {
		return id;
	}

	public Product getProduct() {
		return product;
	}

	public int getOrdered() {
		return ordered;
	}


}
