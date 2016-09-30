package projectx.entities;

import java.math.BigDecimal;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="Product")
public class Product {
	
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
		
		public Product(String name, int stockLvl, BigDecimal price, int lowStock, int maxStock){
			this.name = name;
			this.currentStockLevel = stockLvl;
			this.price = price;
			this.lowStockLevel = lowStock;
			this.highStockLevel = maxStock;
			this.isDiscontinued = false;
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
		
}
