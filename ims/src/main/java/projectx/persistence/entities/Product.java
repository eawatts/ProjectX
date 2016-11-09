package projectx.persistence.entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@NamedQueries({
		/*
		 * @NamedQuery(name = Product.FIND_BY_PRODUCT_NAME, query =
		 * "SELECT p FROM Product p WHERE p.name = :Productname")
		 * 
		 * @NamedQuery(name = Product.FIND_LOW_PRODUCT,
		 * query="SELECT *, current_stock-low_stock_limit AS surplus FROM Product ORDER BY surplus LIMIT 25"
		 * ),
		 * 
		 * @NamedQuery(name = Product.SEARCH_PRODUCT, query
		 * ="SELECT * FROM Product WHERE name LIKE '%:param%'")
		 */
})

@Entity
@Table(name = "product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String FIND_BY_PRODUCT_NAME = "Product.findByProductName";
	public static final String FIND_LOW_PRODUCT = "Product.findlowproduct";
	public static final String SEARCH_PRODUCT = "Product.searchProduct";

	@Id
	@GeneratedValue()
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "current_stock", nullable = false)
	private int currentStock;

	@Column(name = "name", nullable = false, length = 50)
	@Size(min = 2, max = 50)
	private String name;

	@Column(name = "price", precision = 7, scale = 2, nullable = false)
	private double price;

	@Column(name = "low_stock_limit", nullable = false)
	private int lowLimit;

	@Column(name = "is_discontinued", nullable = false)
	private boolean isDiscontinued;

	@Column(name = "description", nullable = false, length = 500)
	private String description;

	private ArrayList<String> images;

	public Product() {
	}

	public Product(Integer id, String name, int stockLvl, double price, int lowStock, String description,
			ArrayList<String> imglists) {

		this.id = id;
		this.name = name;
		this.currentStock = stockLvl;
		this.price = price;
		this.lowLimit = lowStock;
		this.isDiscontinued = true;
		this.description = description;
		this.images = imglists;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCurrentStock() {
		return currentStock;
	}

	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getLowLimit() {
		return lowLimit;
	}

	public void setLowLimit(int lowLimit) {
		this.lowLimit = lowLimit;
	}

	public boolean getIsDiscontinued() {
		return isDiscontinued;
	}

	public void setIsDiscontinued(boolean isDiscontinued) {
		this.isDiscontinued = isDiscontinued;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<String> getImgs() {
		return images;
	}

	public void setImgs(ArrayList<String> imglists) {
		this.images = imglists;
	}
	
	public String getImage() {
		return images.get(0);
	}

	@Override
	public boolean equals(Object obj) {

		return (obj != null && getClass() == obj.getClass() && id != null) ? id.equals(((Product) obj).id)
				: (obj == this);
	}

	@Override
	public int hashCode() {
		return (id != null) ? (getClass().hashCode() + id.hashCode()) : super.hashCode();
	}
}
