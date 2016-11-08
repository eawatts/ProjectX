package projectx.persistence.repositories;

import java.util.List;

import projectx.persistence.entities.Product;

public interface SearchRepository
{
	public List<Product> search(String searchTerm, String searchType);
}
