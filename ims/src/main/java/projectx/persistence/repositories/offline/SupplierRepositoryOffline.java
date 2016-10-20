package projectx.persistence.repositories.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import projectx.persistence.entities.Supplier;
import projectx.persistence.repositories.SupplierRepository;
import projectx.persistence.util.InitialData;

@Stateless
@Default
public class SupplierRepositoryOffline implements SupplierRepository {

	@Inject
	InitialData initialData;
	
	@Override
	public void createSupplier(Supplier supplier) {
		initialData.addSupplier(supplier);

	}

	@Override
	public Supplier findBySupplierName(String name) {
		return initialData.findBySupplierName(name);
	}

	@Override
	public Supplier findBySupplierId(int id) {
		return initialData.findBySupplierId(id);
	}

	@Override
	public List<Supplier> getSuppliers() {
		return initialData.getSuppliers();
	}

	@Override
	public void updateSupplier(Supplier supplier) {
		initialData.updateSupplier(supplier);

	}

	@Override
	public void deletSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		
	}

}
