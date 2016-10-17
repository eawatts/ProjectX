package projectx.persistence.repositories.interfaces;

import java.util.List;

import projectx.persistence.entities.Supplier;


public interface SupplierRespository {
	public void createSupplier(Supplier supplier);
	public Supplier findByfindBySupplierName(String name);
	public Supplier findByfindBySupplierId(String name);
	public List<Supplier> getSuppliers();
	public void updateSupplier(Supplier supplier);

}
