package projectx.persistence.controllers;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Supplier;
import projectx.persistence.services.SupplierService;

@Named("suppliers")
@SessionScoped
public class SupplierController implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject 
	private SupplierService supplierService;
	
	private int id;
	private String name;
	private String addressLine1;
	private String addressLine2;
	private String postcode;
	private String phone;
	
	public ArrayList<Supplier> getSuppliersList(){	
		return supplierService.getSuppliersList();
	}

	public void selected(int id, String name, String addressLine1, String addressLine2, String postcode, String phone) {
		this.id = id;
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.phone = phone;
		this.postcode = postcode;
		System.out.println(id + ": " + name);
	}
	
	public void  editSupplier(){
		System.out.println("edited supplier" + name);
		supplierService.editSupplier(id, name, addressLine1, addressLine2, postcode, phone);
	}
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}	
}