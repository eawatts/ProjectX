package projectx.persistence.repositories.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import projectx.persistence.entities.Address;
import projectx.persistence.repositories.AddressRepository;

/**
 * @author James
 */
@Stateless
@Default
public class AddressRepositoryOffline implements AddressRepository {

	@Override
	public void persistAddress(Address address) {
		// TODO Auto-generated method stub

	}

	@Override
	public void persistAddress(List<Address> address) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Address> getAddresses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deactivate(Address address) {
		// TODO Auto-generated method stub

	}

	@Override
	public Address findById(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findByLine1(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findByLine2(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Address findByPostCode(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
