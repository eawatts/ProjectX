package projectx;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import projectx.persistence.entities.Product;

@Named("products")
@SessionScoped
public class SearchController implements Serializable{
	@Inject
	private ProductManager productManager;
	private Product product;
	
}

