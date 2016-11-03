package projectx.persistence.repositories.hibernate;

import java.util.ArrayList;

import projectx.persistence.entities.Supplier;
import projectx.persistence.repositories.SupplierRepository;

@Stateless
@Alternative

public class SupplierRepositoryHibernate implements SupplierRepository{

	@Override
	public Supplier findBySupplierName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier findBySupplierId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Supplier> getSuppliers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSupplier(int id, String name, String addressLine1, String addressLine2, String postcode,
			String phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		
	}
	
}