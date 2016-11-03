package projectx.controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("search")
@RequestScoped
public class SearchController {

	@Inject
	private SearchService searchService;
	
	private String parameter;
	private String category;
	
	public String search(String parameter, String category){
		ArrayList searchresults = searchService.search(parameter,category);
		for(Object  a:searchresults){
			System.out.println(a);
		}
		return null;
	}

	public String getParameter() {
		return parameter;
	}

	public void setParameter(String parameter) {
		this.parameter = parameter;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
