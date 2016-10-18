package projectx.controllers;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import projectx.persistence.entities.Category;

@Named("category")
@RequestScoped
public class CategoryController {
		
		private String testMessage = "This is a test message";
		private ArrayList <Category> catList = new ArrayList<Category>();

		
		
		public ArrayList <Category> populateCategories(ArrayList <Category> catList){
		Category gnomes = new Category(1, "Gnomes");
		Category rh = new Category(2, "Rakes and Hoes");
		Category mtn = new Category(3, "Maintenance");
		
		catList.add(gnomes);
		catList.add(rh);
		catList.add(mtn);
		
		return catList;
		
		}
		
		
		public ArrayList <Category> getCategories(){
			
			catList = populateCategories(catList);
			return catList;
		}
		
	
		
		public String getTestMessage(){
			return testMessage;
		}
		public void setTestMessage(String testMessage) {
			this.testMessage = testMessage;
		}
	}

