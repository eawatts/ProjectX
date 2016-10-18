package projectx.controllers;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
//import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import projectx.persistence.entities.Product;

@Named("product")
@RequestScoped
public class ProductController {
	
private String testMessage = "This is a test message - Ed and Tom are better than Adam";
	
	private ArrayList<String> testMessages = new ArrayList<String>();
	private ArrayList<Product> products = new ArrayList<Product>();
	
	private ArrayList<String> fillMessages(String testMessage){
		for(int i=0;i<0;i++){
			testMessages.add(testMessage);
		}
		return testMessages;
	}
	
	public String getTestMessage() {
		return testMessage;
	}

	public void setTestMessage(String testMessage) {
		this.testMessage = testMessage;
	}

	public ArrayList<String> getList(){
		fillMessages(testMessage);
		return testMessages;
	}
	
//	public ArrayList<Product> getProducts(){
//		return Product.products;
//	}
	
	public String getProductName(){
		String productName = " Big fat gnome";
		return productName;
		
	}
	
	public String getImgPath(){
		String imagePath = "img/products/RedGnome.png";
		return imagePath;
	}
	
	public int getChosenQuantity(){
		
		return 20;
	}
	
	public String getStockStatus(){
		String stat = " In Stock";
		return stat;
	}
	
	public int getProductPrice(){
		return 10;
	}
	
	public String getProductDescription(){
		String desc = "This Gnome is fat";
		return desc;
	}
	
	
	
}
