package projectx.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.repositories.SearchRepository;

@Stateless
public class SearchService
{
	@Inject
	private SearchRepository searchRepo;

	public List search(String parameter)
	{
		return searchRepo.search(parameter);
	}

}
