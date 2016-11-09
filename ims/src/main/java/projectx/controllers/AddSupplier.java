package projectx.controllers;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Supplier;
import projectx.services.SupplierService;

@Named("newSupplier")
@RequestScoped
public class AddSupplier{
	@Inject
	private SupplierService supplierService;
	
	private Supplier supplier;
	private String error="";
	
	@PostConstruct
	private void intialiseProperties(){
		this.supplier=new Supplier();
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	
	public String addSupplier(){
		supplierService.addSupplier(supplier);
		return "suppliers";
	}
	
	
	
	
	
	
	
}