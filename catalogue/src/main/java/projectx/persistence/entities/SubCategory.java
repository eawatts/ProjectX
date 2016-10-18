package projectx.persistence.entities;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table(name = "SubCategory")
@NamedQueries(
	{ 
		@NamedQuery(name = SubCategory.FIND_BY_ID, query = "SELECT s FROM subcategory s WHERE s.id = :id"),
		@NamedQuery(name = SubCategory.FIND_BY_NAME, query = "SELECT s FROM subcategory s WHERE s.name = :name"),
		@NamedQuery(name = SubCategory.FIND_ALL, query = "SELECT s FROM subcategory s WHERE s.id = :id"),
		@NamedQuery(name = SubCategory.INSERT_CATEGORY, query = "INSERT INTO subcategory s (id, name) VALUES(:id, :name)"),
		@NamedQuery(name = SubCategory.UPDATE_CATEGORY, query = "UPDATE subcategory s SET s.id=:newid, s.name=:newname WHERE s.id =:id"),
		@NamedQuery(name = SubCategory.FIND_PRODUCTS, query = "SELECT products FROM subcategory s WHERE s.name = :name")
	}
)
public class SubCategory {
	
		public static final String FIND_BY_ID = "SubCategory.findByID";
		public static final String FIND_BY_NAME = "SubCategory.findByName";
		public static final String FIND_ALL = "SubCategory.findAll";
		public static final String FIND_PRODUCTS = "SubCategory.findProducts";
		public static final String INSERT_CATEGORY = "SubCategory.insert";
		public static final String UPDATE_CATEGORY = "SubCategory.update";
		@Id
		@GeneratedValue
		@Column(name = "id", nullable = false)
		private int subCategoryID;

		@Column(name = "name", nullable = false)
		private String name;

		@Column(name = "products", nullable = true)
		private ArrayList <Product> products;
		
		/**
		 * Constructor
		 * 
		 * @param id
		 * @param nName
		 */
		public SubCategory(int id, String nName)
		{
			setSubCategoryID(id);
			setName(nName);
			this.products = null;
		}


		/**
		 * @return the subcategoryID
		 */
		public int getSubCategoryID()
		{
			return subCategoryID;

		}

		/**
		 * @param subCategoryID 
		 * @param subcategoryID
		 *            the subcategoryID to set
		 */
		public void setSubCategoryID(int subCategoryID)
		{
			this.subCategoryID = subCategoryID;
		}

		/**
		 * @return the name
		 */
		public String getName()
		{
			return name;
		}

		/**
		 * @param name
		 *            the name to set
		 */
		public void setName(String name)
		{
			this.name = name;
		}
		
		/**
		 * 
		 * @return product list
		 */
		public ArrayList<Product> getProducts() {
			return products;
		}
		/**
		 * add a product to the sub-category
		 * @param products
		 */
		
		public void setProducts(Product product) {
			products.add(product);
		}

	}

