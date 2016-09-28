package projectx.assets;

import javax.persistence.*;

@Entity
@Table(name="Product")
public class Product {

		private int id;
		private int currentStockLevel;
		private String name;
		private double price;
		private int lowStockLevel;
		private int highStockLevel;
		private boolean isDiscontinued;
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		public int getId() {
			return id;
		}
		@Column(name="current_stock_level")
		public int getCurrentStockLevel() {
			return currentStockLevel;
		}
		public void setCurrentStockLevel(int currentStockLevel) {
			this.currentStockLevel = currentStockLevel;
		}
		@Column
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Column
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		@Column(name="low_stock_level")
		public int getLowStockLevel() {
			return lowStockLevel;
		}
		public void setLowStockLevel(int lowStockLevel) {
			this.lowStockLevel = lowStockLevel;
		}
		@Column(name="high_stock_level")
		public int getHighStockLevel() {
			return highStockLevel;
		}
		public void setHighStockLevel(int highStockLevel) {
			this.highStockLevel = highStockLevel;
		}
		@Column(name="is_discontinued")
		public boolean isDiscontinued() {
			return isDiscontinued;
		}
		public void setDiscontinued(boolean isDiscontinued) {
			this.isDiscontinued = isDiscontinued;
		}
		
}
