package projectx.services;

import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.repositories.ProductsOrderedRepository;

public class productsOrderedService
{
	@Inject ProductsOrderedRepository productsOrderedRepo;

	public static double getPrice(Product product)
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
