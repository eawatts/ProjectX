package projectx.controllers;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import projectx.persistence.entities.Product;

@Named("REMOVE_products")
@RequestScoped
public class REMOVE_ProductController {
	
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
	
	public String getProductName(){
		String productName = " Big fat gnome";
		return productName;
		
	}
	
	public String getImgPath(){
		String imagePath = "img/products/gnome_red-hat.png";
		return imagePath;
	}
	
	public int getChosenQuantity(){
		
		return 20;
	}
	
	public String getStockStatus(){
		String stat = " In Stock";
		return stat;
	}
	
	public double getProductPrice(){
		return 10.00;
	}
	
	public String getProductDescription(){
		String desc = "This Gnome is fat";
		return desc;
	}
}
