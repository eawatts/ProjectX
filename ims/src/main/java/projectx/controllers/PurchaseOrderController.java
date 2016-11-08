package projectx.controllers;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.ProductsOrdered;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.entities.Supplier;
import projectx.persistence.util.OrderState;
import projectx.persistence.webentities.CurrentSession;
import projectx.persistence.webentities.PurchaseOrderProduct;
import projectx.services.PurchaseOrderSerivce;
import projectx.services.productsOrderedService;


@Named("purchase_order")
@RequestScoped
public class PurchaseOrderController implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject 
	private PurchaseOrderSerivce purchaseOrderService;
	@Inject
	private SearchController searchController;
	@Inject
	private ProductController productController;
	private int id;
	private Supplier supplier;
	private boolean approved;
	private Date approvalDate;
	private OrderState status;
	private List<ProductsOrdered> productsOrdered;


	public List getPurchaseOrderList(){	
		if(searchController.getSearchResults() != null && searchController.getSearchResults().size() > 0 && searchController.getSearchResults().get(0) instanceof PurchaseOrder)
		{
			return searchController.getSearchResults();
		}
		else
		{
			return purchaseOrderService.getPurchaseOrderList();
		}
	}
	public PurchaseOrder findPOById(int id){
		return purchaseOrderService.findPurchaseOrderById(id);
	} 
	
	public void viewPO(int id){
		this.id=id;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Supplier getSupplier() {
		return supplier;
	}


	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}


	public boolean isApproved() {
		return approved;
	}


	public void setApproved(boolean approved) {
		this.approved = approved;
	}


	public Date getApprovalDate() {
		return approvalDate;
	}


	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}


	public OrderState getStatus() {
		return status;
	}


	public void setStatus(OrderState status) {
		this.status = status;
	}


	public List<ProductsOrdered> getProductsOrdered() {
		return productsOrdered;
	}


	public void setProductsOrdered(List<ProductsOrdered> productsOrdered) {
		this.productsOrdered = productsOrdered;
	}
	
	public List<PurchaseOrderProduct> createPurchaseOrderEntry(){
		return purchaseOrderService.createPurchaseOrderEntry();
	}
	public void generatePurchaseOrder()
	{
		List<Product> productList = productController.getTop25LowStockProducts();
		
		for(int i=0;i<productList.size();i++)
		{
			productsOrdered.add(new ProductsOrdered(i,productList.get(i), productList.get(i).getLowLimit() - productList.get(i).getCurrentStock(), null, productsOrderedService.getPrice(productList.get(i))));
		}
		
		
		
	}
	
	
}
