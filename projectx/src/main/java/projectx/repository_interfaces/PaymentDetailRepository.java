package projectx.repository_interfaces;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import projectx.entities.PaymentDetails;

@Stateless
@Default
public interface PaymentDetailRepository
{
	public void persistPaymentDetails (PaymentDetails paymentDetails);
	public void persistPaymentDetails(List<PaymentDetails> paymentDetails);
	public List<PaymentDetails> getPaymentDetails();
	public void updatePaymentDetail(PaymentDetails paymentDetails);
	public PaymentDetails findByUser_id(int user_id);
	public PaymentDetails findByid(long id);

}