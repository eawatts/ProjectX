package projectx.persistence.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@NamedQueries({

/*		@NamedQuery(name = ProductsOrdered.INSERT_ORDEREDPRODUCTS, query = "INSERT INTO OrderedProducts (id,product,ammountOrdered) VALUES (:id, :product, :ammountOrdered)"),
		@NamedQuery(name = ProductsOrdered.FIND_ALL, query = "SELECT * FROM OrderedProducts"),
		@NamedQuery(name = ProductsOrdered.FIND_BY_PRODUCT, query = "SELECT * FROM OrderedProducts o where o.productId=:productId"),
		@NamedQuery(name = ProductsOrdered.FIND_BY_ID, query = "SELECT * FROM OrderedProducts o where o.id=:id"),
		@NamedQuery(name = ProductsOrdered.UPDATE_ORDEREDPRODUCTS, query = "UPDATE OrderedProducts o SET o.productId=:newProductId , o.ammountOrdered=:newAmooutnOrdered  WHERE o.id=:newId,")*/
})

@Entity
@Table(name = "products_ordered")

public class ProductsOrdered {
	public static final String INSERT_ORDEREDPRODUCTS = "ProductsOrdered.saveProductsOrdered";
	public static final String FIND_ALL = "ProductsOrdered.findAll";
	public static final String FIND_BY_PRODUCT = "ProductsOrdered.findByProduct";
	public static final String FIND_BY_ID = "ProductsOrdered.findById";
	public static final String UPDATE_ORDEREDPRODUCTS = "ProductsOrdered.updatePurchaseOrder";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@NotNull
	@JoinColumn(name = "product")
	private Product product;

	@NotNull
	@Column(name = "quantity")
	private int quantity;

	@NotNull
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "purchase_order")
	private PurchaseOrder purchaseOrder;
	
	@NotNull
	@Column(name= "price")
	private double price;

	public ProductsOrdered() {
	}

	public ProductsOrdered(Integer id, Product product, int quantity, PurchaseOrder purchaseOrder, double price) {
		super();
		this.id = id;
		this.product = product;
		this.quantity = quantity;
		this.purchaseOrder = purchaseOrder;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getOrdered() {
		return quantity;
	}

	public void setOrdered(int ordered) {
		this.quantity = ordered;
	}

	public PurchaseOrder getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
