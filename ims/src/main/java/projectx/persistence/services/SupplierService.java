package projectx.persistence.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Supplier;
import projectx.persistence.repositories.offline.SupplierRepositoryOffline;

@Stateless
public class SupplierService{
	@Inject
	private SupplierRepositoryOffline supplierRepo;
	
	public Supplier findSupplierById(String id){
		return findSupplierById(Integer.parseInt(id));
	}	
	
	public Supplier findSupplierById(int id){
		return supplierRepo.findBySupplierId(id);
	}
	public List<Supplier> getSuppliers() {
		return supplierRepo.getSuppliers();
	}
	
	public Supplier findByName(String name) {
		return supplierRepo.findBySupplierName(name);
	}
	public void updateSupplier(Supplier supplier){
		supplierRepo.updateSupplier(supplier);
	}

}