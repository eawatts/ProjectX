package projectx.persistence.repositories.hibernate;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import projectx.persistence.repositories.SearchRepository;
import projectx.persistence.repositories.hibernate.database.HibernateDatabase;


@Stateless
@Alternative // This can be used by changing beans.xml
public class SearchRepositoryHibernate implements SearchRepository{

	
	@Inject
	private HibernateDatabase db;
	
	
	@Override
	public List search(String searchTerm, String searchType) {
		
		switch(searchType){
		case "product": return db.searchProducts(searchTerm);
		case "supplier": return db.searchSupplier(searchTerm);
		case "purchase order": return db.searchPO(searchTerm);
		}
		return null;
	
	}
	
}
