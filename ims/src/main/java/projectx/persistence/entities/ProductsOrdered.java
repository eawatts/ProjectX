package projectx.persistence.entities;

import javax.persistence.*;

@NamedQueries({
	@NamedQuery (name = ProductsOrdered.INSERT_ORDEREDPRODUCTS, query = "INSERT INTO OrderedProducts (id,product,ammountOrdered) VALUES (:id, :product, :ammountOrdered)");
	//@NamedQuery (name=ProductsOrdered.FIND_ALL,query = "");
	//@NamedQuery (name = ProductsOrdered.FIND_BY_PRODUCT,query = "");
	//@NamedQuery (name = ProductsOrdered.FIND_BY_ID,query = "");
	//@NamedQuery (name = ProductsOrdered.UPDATE_ORDEREDPRODUCTS,query = "");
})


//@NamedQueries({
	//@NamedQuery (name = PurchaseOrder.INSERT_PURCHASEORDER, query = "INSERT INTO purchaseOrder p (id, supplier,approved,approvalDate,satus,products) VALUES(:id, :supplier, :approved, :approvalDate, :satus, :products) "),
	//@NamedQuery (name = PurchaseOrder.FIND_ALL, query = "SELECT * FROM purchaseOrder p "),
	//@NamedQuery (name = PurchaseOrder.FIND_BY_APPROVALDATE, query = "SELECT * from purchaseOrder p where p.approvalDate =:approvalDate"),
	//@NamedQuery (name = PurchaseOrder.FIND_BY_APPROVED, query = "SELECT * from purchaseOrder p where p.approved =:approved"),
	//@NamedQuery (name = PurchaseOrder.FIND_BY_STATUS, query = "SELECT * from purchaseOrder p where p.status =:status"),
	//@NamedQuery (name = PurchaseOrder.UPDATE_PURCHASEORDER, query = "UPDATE purchaseOrder p SET p.supplier=:newSupplier, p.approved=:newApproved, p.approvalDate=:newApprovalDate, p.status=:newStatus, p.productsOrdered=:newProductsOrdered WHERE p.id =:id"),
//})

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
	
	
	/**
	 * Constructor
	 * 
	 * @param id
	 * @param nproduct
	 * @param nOrdered
	 */
	
	public ProductsOrdered(int id, Product nProduct, int nOrdered) {
		setId(id);
		setProduct(nProduct);
		setAmmountOrdered(nOrdered);
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
