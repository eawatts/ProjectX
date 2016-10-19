package projectx.persistence.webentities;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import projectx.persistence.entities.Product;

@SessionScoped
@Named("current_product")
public class CurrentProduct implements Serializable {

	private static final long serialVersionUID = 1L;

	private Product product;

	public Product getProduct() {
		return product;
	}
	
	public void setProduct(Product product){
		this.product = product;
	}
}
