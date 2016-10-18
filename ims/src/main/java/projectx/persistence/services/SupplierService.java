package projectx.persistence.services;

import java.util.List;

import javax.enterprise.context.SessionScoped;

import projectx.persistence.entities.Product;
import projectx.persistence.entities.Supplier;
import projectx.persistence.repositories.interfaces.SupplierRepository;

@SessionScoped
public class SupplierService{
	SupplierRepository supplierRepo;
	
	public Supplier findSupplierById(String id)
	{
		return findSupplierById(Integer.parseInt(id));
	}
	public Supplier findSupplierById(int id)
	{
		return supplierRepo.findBySupplierId(id);
	}
	public List<Supplier> getSuppliers() 
	{
		return supplierRepo.getSuppliers();
	}

}