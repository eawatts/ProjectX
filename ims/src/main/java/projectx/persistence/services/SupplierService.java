package projectx.persistence.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Supplier;
import projectx.persistence.repositories.SupplierRepository;

@Stateless
public class SupplierService{
	@Inject
	private SupplierRepository supplierRepo;
	
	public Supplier findSupplierById(String id)
	{
		return findSupplierById(Integer.parseInt(id));
	}
	public Supplier findSupplierById(int id)
	{
		return supplierRepo.findBySupplierId(Integer.toString(id));
	}
	public List<Supplier> getSuppliers() 
	{
		return supplierRepo.getSuppliers();
	}
	public Supplier findById(Object supplier) {
		// TODO Auto-generated method stub
		return null;
	}

}