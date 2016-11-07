package projectx.persistence.repositories;

import java.util.List;

import projectx.persistence.entities.Address;



public interface AddressRepository{
	public void persistAddress(Address address);
	public void persistAddress(List<Address> address);
	public List<Address> getAddresses();
	public void deactivate(Address address);
	public Address findById(int user_id);
	public Address findByLine1(long id);
	public Address findByLine2(long id);
	public Address findByPostCode(long id);
}