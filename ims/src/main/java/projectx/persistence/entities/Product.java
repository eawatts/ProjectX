package projectx.persistence.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries ({
@NamedQuery (name = Product.FIND_BY_PRODUCT_NAME, query = "SELECT p FROM Product p WHERE p.name = :Productname")
})
@Entity
@Table(name="Product")
public class Product {
	
		public static final String FIND_BY_PRODUCT_NAME = "Product.findByProductName";
		
		@Id
		@Column(name="id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		@Column(name="current_stock", nullable = false)
		private int currentStock;
		
		@Column(name="name", nullable = false, length = 50)
		@Size (min = 2, max = 50)
		private String name;
		
		@Column(name="price", precision = 7, scale = 2, nullable = false)
		private double price;
		
		@Column(name="low_stock_limit", nullable = false)
		private int lowLimit;
		
		
		@Column(name="is_discontinued", nullable = false)
		private boolean isDiscontinued;
		
		@Column(name="description", nullable = false, length = 500)
		private String description;
		
		public Product(){};
		public Product(int id, String name, int stockLvl, double price, int lowStock, String description){
			this.id = id;
			this.name = name;
			this.currentStock = stockLvl;
			this.price = price;
			this.lowLimit = lowStock;
			this.isDiscontinued = false;
			this.description = description;
		}
		/**
		 * @return the id
		 */
		public int getId()
		{
			return id;
		}
		/**
		 * @param id the id to set
		 */
		public void setId(int id)
		{
			this.id = id;
		}
		/**
		 * @return the currentStock
		 */
		public int getCurrentStock()
		{
			return currentStock;
		}
		/**
		 * @param currentStock the currentStock to set
		 */
		public void setCurrentStock(int currentStock)
		{
			this.currentStock = currentStock;
		}
		/**
		 * @return the name
		 */
		public String getName()
		{
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name)
		{
			this.name = name;
		}
		/**
		 * @return the price
		 */
		public double getPrice()
		{
			return price;
		}
		/**
		 * @param price the price to set
		 */
		public void setPrice(double price)
		{
			this.price = price;
		}
		/**
		 * @return the lowLimit
		 */
		public int getLowLimit()
		{
			return lowLimit;
		}
		/**
		 * @param lowLimit the lowLimit to set
		 */
		public void setLowLimit(int lowLimit)
		{
			this.lowLimit = lowLimit;
		}
		/**
		 * @return the isDiscontinued
		 */
		public boolean isDiscontinued()
		{
			return isDiscontinued;
		}
		/**
		 * @param isDiscontinued the isDiscontinued to set
		 */
		public void setDiscontinued(boolean isDiscontinued)
		{
			this.isDiscontinued = isDiscontinued;
		}
		/**
		 * @return the description
		 */
		public String getDescription()
		{
			return description;
		}
		/**
		 * @param description the description to set
		 */
		public void setDescription(String description)
		{
			this.description = description;
		}
		public List<Supplier> supplierList(int productID)
		{
			ArrayList<Supplier> suppliers = new ArrayList<Supplier>();
			suppliers.add(new Supplier(1,"Gnome supplier", null, null, null, null));
			suppliers.add(new Supplier(2,"GnomeOther supplier", null, null, null, null));
			suppliers.add(new Supplier(3,"Gnome Super supplier", null, null, null, null));
			return suppliers;
		}
		
		
}
