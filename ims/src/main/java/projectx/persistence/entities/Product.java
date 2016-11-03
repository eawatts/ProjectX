package projectx.persistence.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@NamedQueries({
		/*@NamedQuery(name = Product.FIND_BY_PRODUCT_NAME, query = "SELECT p FROM Product p WHERE p.name = :Productname")*/ 
})

@Entity
@Table(name = "product")
public class Product {

	public static final String FIND_BY_PRODUCT_NAME = "Product.findByProductName";

	@Id
	@GeneratedValue()
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "id", nullable = false)
	private int id;

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

	private ArrayList<Supplier> suppliers;

	private ArrayList<String> imgs;

	public Product() {
	}

	public Product(int id, String name, int stockLvl, double price, int lowStock, String description,
			ArrayList<Supplier> suppliers, ArrayList<String> imglists) {
		this.id = id;
		this.name = name;
		this.currentStock = stockLvl;
		this.price = price;
		this.lowLimit = lowStock;
		this.isDiscontinued = true;
		this.description = description;
		this.suppliers = suppliers;
		this.imgs = imglists;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public List<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(ArrayList<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public ArrayList<String> getImgs() {
		return imgs;
	}

	public void setImgs(ArrayList<String> imglists) {
		this.imgs = imglists;
	}
}
