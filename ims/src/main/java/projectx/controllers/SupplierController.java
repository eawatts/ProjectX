package projectx.controllers;

import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Supplier;
import projectx.services.SupplierService;

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
	private Supplier supplierById;
   
	
	public Supplier getSupplierById(){
		System.out.println("test");
		return supplierService.findSupplierById(id);
	}
	
	public String viewSupplier(int id){
		System.out.println(id);
		this.id=id;
		return "supplier";
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
	
	public void  editSupplier(int id, String name, String addressLine1, String addressLine2, String postcode, String phone){
		System.out.println("edited supplier" + getName());
		supplierService.editSupplier(id, name, addressLine1, addressLine2, postcode, phone);
	}
	
	public void setSupplierById(Supplier supplierById){
		this.supplierById=supplierById;
	}
	
	public ArrayList<Supplier> getSuppliersList(){
		return supplierService.getSuppliersList();
		
	}	
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1()
	{
		return addressLine1;
	}
	/**
	 * @param addressLine1 the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1)
	{
		this.addressLine1 = addressLine1;
	}
	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2()
	{
		return addressLine2;
	}
	/**
	 * @param addressLine2 the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2)
	{
		this.addressLine2 = addressLine2;
	}
	/**
	 * @return the postcode
	 */
	public String getPostcode()
	{
		return postcode;
	}
	/**
	 * @param postcode the postcode to set
	 */
	public void setPostcode(String postcode)
	{
		this.postcode = postcode;
	}
	/**
	 * @return the phone
	 */
	public String getPhone()
	{
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}


}
