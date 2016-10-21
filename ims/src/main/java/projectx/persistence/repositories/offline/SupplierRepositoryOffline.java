package projectx.persistence.repositories.offline;

import java.util.ArrayList;
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
	public ArrayList<Supplier> getSuppliers() {
		return initialData.getSuppliers();
	}

	@Override
	public void updateSupplier(int id, String name, String addressLine1, String addressLine2, String postcode, String phone) {
		initialData.updateSupplier(id, name, addressLine1, addressLine2, postcode, phone);

	}

	@Override
	public void deletSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		
	}

}
