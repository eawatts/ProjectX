package projectx.persistence.repositories.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import projectx.persistence.entities.Supplier;
import projectx.persistence.repositories.SupplierRepository;

@Stateless
@Default
public class SupplierRepositoryOffline implements SupplierRepository {

	@Override
	public void createSupplier(Supplier supplier) {
		// TODO Auto-generated method stub

	}

	@Override
	public Supplier findBySupplierName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Supplier findBySupplierId(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Supplier> getSuppliers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSupplier(Supplier supplier) {
		// TODO Auto-generated method stub

	}

}
