package projectx.persistence.entities;

import java.math.BigDecimal;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NamedQueries (
	{
		@NamedQuery (name = Product.FIND_BY_PRODUCT_NAME, query = "SELECT p FROM Product p WHERE p.name = :Productname")
	}
)

@Entity
@Table(name="Product")
public class Product {
	
		public static final String FIND_BY_PRODUCT_NAME = "Product.findByProductName";
		
		@Id
		@Column(name="id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		@Column(name="current_stock_level", nullable = false)
		private int currentStockLevel;
		
		@Column(name="name", nullable = false, length = 50)
		@Size (min = 2, max = 50)
		private String name;
		
		@Column(name="price", precision = 7, scale = 2, nullable = false)
		private BigDecimal price;
		
		@Column(name="low_stock_level", nullable = false)
		private int lowStockLevel;
		
		@Column(name="high_stock_level", nullable = false)
		private int highStockLevel;
		
		@Column(name="is_discontinued", nullable = false)
		private boolean isDiscontinued;
		
		@ManyToOne
		@JoinColumn(name = "subcategory_id", nullable=false)
		@NotNull
		private int sub_id;
		
		
		public Product(){};
		
		public Product(int id, String name, int stockLvl, BigDecimal price, int lowStock, int maxStock, int sub_id){
			this.id = id;
			this.name = name;
			this.currentStockLevel = stockLvl;
			this.price = price;
			this.lowStockLevel = lowStock;
			this.highStockLevel = maxStock;
			this.isDiscontinued = false;
			this.sub_id = sub_id;
		}
		
		public int getId() {
			return id;
		}
		
		public int getCurrentStockLevel() {
			return currentStockLevel;
		}
		public void setCurrentStockLevel(int currentStockLevel) {
			this.currentStockLevel = currentStockLevel;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		
		public int getLowStockLevel() {
			return lowStockLevel;
		}
		public void setLowStockLevel(int lowStockLevel) {
			this.lowStockLevel = lowStockLevel;
		}
		
		public int getHighStockLevel() {
			return highStockLevel;
		}
		public void setHighStockLevel(int highStockLevel) {
			this.highStockLevel = highStockLevel;
		}
		
		public boolean isDiscontinued() {
			return isDiscontinued;
		}
		public void setDiscontinued(boolean isDiscontinued) {
			this.isDiscontinued = isDiscontinued;
		}
		public int getSub_id() {
			return sub_id;
		}
		public void setSub_id(int sub_id) {
			this.sub_id = sub_id;
		}
}
