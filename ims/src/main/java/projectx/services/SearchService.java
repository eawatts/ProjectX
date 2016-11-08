package projectx.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.repositories.SearchRepository;

@Stateless
public class SearchService
{
	@Inject
	private SearchRepository searchRepo;
	
	public List<Product> search(String searchTerm, String searchType)
	{
		if (!(searchType.equals("product") || searchType.equals("supplier") || searchType.equals("purchase order")))
		{
			return null;
		}
		else
		{
			return searchRepo.search(searchTerm,searchType);
		}

	}
}
