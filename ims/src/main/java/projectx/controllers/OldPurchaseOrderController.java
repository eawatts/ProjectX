package projectx.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.ProductsOrdered;
import projectx.persistence.entities.PurchaseOrder;
import projectx.persistence.entities.Supplier;
import projectx.persistence.util.OrderState;
import projectx.persistence.webentities.ProductsOrderedForPurchaseOrders;
import projectx.persistence.webentities.PurchaseOrderProduct;
import projectx.services.PurchaseOrderService;


@SessionScoped
@Named("purchaseOrders")
public class OldPurchaseOrderController implements Serializable{

	private static final long serialVersionUID = 1L;
	@Inject 
	private PurchaseOrderService purchaseOrderService;
	@Inject
	private SearchController searchController;
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
	

	public void setProductsOrdered(List<ProductsOrdered> productsOrdered) {
		this.productsOrdered = productsOrdered;
	}
	
	public List<PurchaseOrderProduct> createPurchaseOrderEntry(){
		return purchaseOrderService.createPurchaseOrderEntry();
	}
	
	public List<ProductsOrdered> getProductsOrdered(Integer id){
		//System.out.println(purchaseOrderService.getProductsOrdered(id).get(1));
		return purchaseOrderService.getProductsOrdered(id);
	}
	/*
	public List<ProductsOrdered> getProductsForPurchaseOrder(){
		ArrayList<ProductsOrdered> products = new ArrayList<ProductsOrdered>();
		products = (ArrayList<ProductsOrdered>) getProductsOrdered(this.id);
		return products; 
	}*/
	public ArrayList<ProductsOrderedForPurchaseOrders> getPurchaseOrdersWithProducts(){
		ArrayList<ProductsOrderedForPurchaseOrders> poWithProducts = new ArrayList<ProductsOrderedForPurchaseOrders>();
		poWithProducts = createProductsOrderedForPurchaseOrder();
		
		return poWithProducts;
	}
	
	private ArrayList<ProductsOrderedForPurchaseOrders> createProductsOrderedForPurchaseOrder(){
		
		ArrayList<PurchaseOrder> purchaseOrders = new ArrayList<PurchaseOrder>();
		purchaseOrders = (ArrayList<PurchaseOrder>) getPurchaseOrderList();
		
		ArrayList<ProductsOrderedForPurchaseOrders> poWithProoducts = new ArrayList<ProductsOrderedForPurchaseOrders>();
		
		for(PurchaseOrder purchaseOrder: purchaseOrders){
			ArrayList<ProductsOrdered> poProducts = new ArrayList<ProductsOrdered>(purchaseOrderService.getProductsOrdered(purchaseOrder.getId()));
			ProductsOrderedForPurchaseOrders p = new ProductsOrderedForPurchaseOrders(purchaseOrder.getId(), purchaseOrder.getSupplier(), purchaseOrder.isApproval(),
					purchaseOrder.getApprovalDate(), purchaseOrder.getStatus(), poProducts);
			poWithProoducts.add(p);
		}
		return poWithProoducts;
}
}
