package projectx.persistence.repositories.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import projectx.persistence.entities.Product;
import projectx.persistence.repositories.SearchRepository;
import projectx.persistence.repositories.hibernate.database.HibernateSession;


@Stateless
@Alternative // This can be used by changing beans.xml
public class SearchRepositoryHibernate implements SearchRepository{
	@Inject
	private HibernateSession sessionManager;
	
	@Override
	public List<Product> search(String searchTerm, String searchType) {
		
		switch(searchType){
		case "product": return searchProducts(searchTerm);
//		case "supplier": return searchSupplier(searchTerm);
//		case "purchase order": return searchPO(searchTerm);
		}
		return null;
	}
	
	private List<Product> searchProducts(String param) {
		List<Product> products = new ArrayList<>();
		try {
			products = sessionManager.getSession().createNamedQuery(Product.SEARCH_PRODUCT, Product.class).setParameter("param", param).getResultList();
		} catch (Exception e) { }
		System.out.println(products.size());
		return products;
	}
	
//	private List<Product> searchSupplier(String param) {
//		Session session = null;
//		try {
//			session = sessionManager.getSession();
//			Query<Product> query = session.getNamedQuery("Supplier.searchSupplier").setParameter("param", param);
//			return (List<Product>) query.getResultList();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			return null;
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}
//
//	private List<Product> searchPO(String param) {
//		Session session = null;
//		try {
//			session = sessionManager.getSession();
//			Query<Product> query = session.getNamedQuery("PurchaseOrder.searchPO").setParameter("param", param);
//			return (List<Product>) query.getResultList();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			return null;
//		} finally {
//			if (session != null) {
//				session.close();
//			}
//		}
//	}
}
