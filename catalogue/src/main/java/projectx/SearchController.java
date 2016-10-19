package projectx;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;

@Named("products")
@SessionScoped
public class SearchController implements Serializable{
	@Inject
	private ProductRepository  productManager;
	private Product product;
	
}

