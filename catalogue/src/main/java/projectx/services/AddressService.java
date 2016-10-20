package projectx.services;

import javax.inject.Inject;

import projectx.persistence.entities.Address;
import projectx.persistence.repositories.interfaces.AddressRepository;

public class AddressService{
	
	@Inject
	private AddressRepository addressRepository;
	
	public void setHouseNumber(String housenumber){
		
	}
	public void setStreetName(String street){
		
	}
	public void setTownName(String town){
		
	}
	public void setPostCode(String postcode){
		
	}
	public Address createNewAddress(String housenumber, String street, String town, String postcode) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}