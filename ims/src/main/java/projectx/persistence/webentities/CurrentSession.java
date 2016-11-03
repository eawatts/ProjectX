package projectx.persistence.webentities;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.Supplier;
import projectx.persistence.entities.User;


@SessionScoped
@Named("current_session")
public class CurrentSession implements Serializable{

		private static final long serialVersionUID = 1L;
		private User user;
		private PendingPurchaseOrder pendingPurchaseOrder;

		@PostConstruct
		public void setupCurrentSession(){
			this.pendingPurchaseOrder = new PendingPurchaseOrder();
			this.pendingPurchaseOrder.addProductToPurchaseOrder(new Product(), 0, new Supplier());
		}
		
		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public String getUserFirstName() {
			return this.user.getFirstname();
		}

		public boolean isLoggedIn() {
			return (user == null) ? false : true;
		}

		public void logout() {
			this.user = null;
		}
		
		public PendingPurchaseOrder getPendingPurchaseOrder(){
			return pendingPurchaseOrder;
		}
		
		public void setPendingPurchaseOrder(PendingPurchaseOrder pendingPurchaseOrder){
			this.pendingPurchaseOrder=pendingPurchaseOrder;
		}

		public void addLineItem(Product product, Supplier supplier, int quantity) {
			pendingPurchaseOrder.addLineItem(product,supplier,quantity);
			
		}
		
}
