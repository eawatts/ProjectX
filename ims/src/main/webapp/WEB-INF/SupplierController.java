import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/*@Named("suppliers")
@SessionScoped*/
public class SupplierController {
	
	@Inject
	private int supplierID;
	private String name;
	private String addressLine1;
	private String addressLine2;
	private String postcode;
	private String phone;
	

	
}
