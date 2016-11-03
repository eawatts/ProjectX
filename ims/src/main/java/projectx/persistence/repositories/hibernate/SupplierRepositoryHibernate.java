package projectx.persistence.repositories.hibernate;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import projectx.persistence.entities.Supplier;
import projectx.persistence.repositories.SupplierRepository;
import projectx.persistence.repositories.hibernate.database.HibernateDatabase;

@Stateless
@Alternative

public class SupplierRepositoryHibernate implements SupplierRepository{
	
	@Inject
	private HibernateDatabase db;

	@Override
	public Supplier findBySupplierName(String name) {
		return db.findBySupplierName(name);
	}

	@Override
	public Supplier findBySupplierId(int id) {
		return db.findBySupplierId(id);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Supplier> getSuppliers() {
		return (ArrayList<Supplier>) db.getSuppliers();
	}

	@Override
	public void updateSupplier(int id, String name, String addressLine1, String addressLine2, String postcode,
			String phone) {
		db.updateSupplier(id, name, addressLine1, addressLine2, postcode, phone);
		
	}

	@Override
	public void deletSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSupplier(Supplier supplier) {
		db.addSupplier(supplier);
		
	}
	
}