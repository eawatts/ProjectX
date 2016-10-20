package projectx.services;

import javax.ejb.Stateless;
import javax.inject.Inject;

import projectx.persistence.entities.Address;
import projectx.persistence.repositories.interfaces.AddressRepository;

@Stateless
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
		Address address = new Address(housenumber, street,town,postcode);
		return address;
	}

	
	
}