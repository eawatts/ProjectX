package projectx.controllers;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.services.SearchService;

@Named("search")
@SessionScoped
public class SearchController implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8718719706065374747L;

	@Inject
	private SearchService searchService;

	private List searchResults;
	private String parameter;

	/**
	 * @return the parameter
	 */
	public String getParameter()
	{
		return parameter;
	}



	/**
	 * @param parameter the parameter to set
	 */
	public void setParameter(String parameter)
	{
		this.parameter = parameter;
	}



	public String search()
	{
		List result = searchService.search(parameter);
		if (result != null)
		{
			this.setSearchResults(result);
			return "search";
		} else
		{
			return null;
		}
	}



	public String clearProductResults()
	{
		this.setSearchResults(null);
		return "products";
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

}
