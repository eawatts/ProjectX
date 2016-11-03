package projectx.persistence.repositories;

import java.util.ArrayList;

import projectx.persistence.entities.Supplier;

public interface SupplierRepository {
	public Supplier findBySupplierName(String name);
	public Supplier findBySupplierId(int id);
	public ArrayList<Supplier> getSuppliers();
	public void updateSupplier(int id, String name, String addressLine1, String addressLine2, String postcode, String phone);
	public void deletSupplier(Supplier supplier);
	public void addSupplier(Supplier supplier);

}
