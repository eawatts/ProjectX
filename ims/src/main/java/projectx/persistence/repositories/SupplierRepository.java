package projectx.persistence.repositories;

import java.util.ArrayList;
import java.util.List;

import projectx.persistence.entities.Supplier;


public interface SupplierRepository {
	public void createSupplier(Supplier supplier);
	public Supplier findBySupplierName(String name);
	public Supplier findBySupplierId(int id);
	public ArrayList<Supplier> getSuppliers();
	public void updateSupplier(Supplier supplier);
	public void deletSupplier(Supplier supplier);

}
