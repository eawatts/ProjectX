package projectx.persistence.controllers;
import projectx.persistence.entities.*;
import java.io.Serializable;

import javax.faces.bean.SessionScoped;
import javax.inject.*;



@Named("purchaseOrders")
@SessionScoped
public class PurchaseOrderController implements Serializable{
	private Product product;
	private Product stock;
	@Inject	private PurchaseOrderSerivce purchaseOrderService;
	
	public void SetProduct(Product product){
		this.product=product;
		stock=purchaseOrderService.findByID(product.getId());
	}
	
	
	
}
