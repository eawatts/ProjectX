package projectx.persistence.services;

import java.util.ArrayList;
import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Supplier;
import projectx.persistence.repositories.SupplierRepository;


@Stateless
public class SupplierService{
	@Inject
	private SupplierRepository supplierRepo;
	
//	public Supplier findSupplierById(String id){
//		return findSupplierById(Integer.parseInt(id));
//	}	
//	
//	public Supplier findSupplierById(int id){
//		return supplierRepo.findBySupplierId(id);
//	}
//	public List<Supplier> getSuppliers() {
//		return supplierRepo.getSuppliers();
//	}
//	
//	public Supplier findByName(String name) {
//		return supplierRepo.findBySupplierName(name);
//	}
//	public void updateSupplier(Supplier supplier){
//		supplierRepo.updateSupplier(supplier);
//	}

	public ArrayList<Supplier> getSuppliersList() {
		return supplierRepo.getSuppliers();
	}

	public void editSupplier(int id, String name, String addressLine1, String addressLine2, String postcode, String phone) {
		supplierRepo.updateSupplier(id, name, addressLine1, addressLine2, postcode, phone);
	}

}