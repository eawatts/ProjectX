package projectx.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.services.SearchService;

@Named("search")
@SessionScoped
public class SearchController implements Serializable{

	@Inject
	private SearchService searchService;
	
	private List searchResults;
	private String parameter;
	private String category;
	
	public String search(){
		List results = searchService.search(parameter,category);
		this.setSearchResults(results);
		if(results!= null)
		{
			return null;
		}
		else
		{
			return null;
		}
		
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

	/**
	 * @return the searchResults
	 */
	public List getSearchResults()
	{
		return searchResults;
	}

	/**
	 * @param searchResults the searchResults to set
	 */
	public void setSearchResults(List searchResults)
	{
		this.searchResults = searchResults;
	}
	
	public void clearResults()
	{
		this.searchResults = null;
	}
}
