package projectx.persistence.repositories.offline;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import projectx.persistence.entities.PaymentDetails;
import projectx.persistence.repositories.PaymentDetailRepository;

@Stateless
@Default
public class PaymentDetailRepositoryOffline implements PaymentDetailRepository {

	@Override
	public void persistPaymentDetails(PaymentDetails paymentDetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public void persistPaymentDetails(List<PaymentDetails> paymentDetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<PaymentDetails> getPaymentDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePaymentDetail(PaymentDetails paymentDetails) {
		// TODO Auto-generated method stub

	}

	@Override
	public PaymentDetails findByUser_id(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentDetails findByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
