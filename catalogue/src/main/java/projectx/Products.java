package projectx;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;



@ManagedBean(name = "productsSold")
@ApplicationScoped
public class Products {
	private String productName;
	private String productPrice;
	private String productDescription;



	public List<Products> createProducts(int size){
		List<Products> list = new ArrayList<Products>();
   	 	list.add(new Products(getProductName(),getProductPrice(),getProductDescription()));
   	 	return list;
	}
	
	
	
	
	public String getProductName() {
		return productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	
	
	
}
