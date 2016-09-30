package projectx.persistence.repositories.interfaces;

import java.util.List;
<<<<<<< HEAD:projectx/src/main/java/projectx/repository_interfaces/PaymentDetailRepository.java
=======

import projectx.persistence.entities.PaymentDetails;
>>>>>>> 2e6eb66369b6bd7be1b29de6d9124dabc8f10604:projectx/src/main/java/projectx/persistence/repositories/interfaces/PaymentDetailRepository.java

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