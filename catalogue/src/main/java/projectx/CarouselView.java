package projectx;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
 
@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class CarouselView implements Serializable {
     private int productAmmount=9;
     private String  productName;
     private String  productDescription;
     private String  productPrice;
     private String[][] products = new String[productAmmount][3];
     
    /* Setters*/
	public void setProducts(String[][] products) {
		for(int i = 0 ; i < productAmmount ; i++){
			products[i][0]=productName;
			products[i][1]=productDescription;
			products[i][2]=productPrice;
		}
	}
	public void setProductAmmount(int productAmmount) {
		this.productAmmount = productAmmount;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	
	/*Getters*/
	public int getProductAmmount() {
		return productAmmount;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public String[][] getProducts() {
		return products;
	}
     
     
     
     
}