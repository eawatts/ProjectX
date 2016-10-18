package projectx.persistence.repositories.interfaces;

import java.util.List;

import projectx.persistence.entities.Supplier;


public interface SupplierRepository {
	public void createSupplier(Supplier supplier);
	public Supplier findBySupplierName(String name);
	public Supplier findBySupplierId(String name);
	public List<Supplier> getSuppliers();
	public void updateSupplier(Supplier supplier);

}
