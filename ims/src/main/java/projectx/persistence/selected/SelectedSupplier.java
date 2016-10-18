package projectx.persistence.selected;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Supplier;
import projectx.persistence.services.SupplierService;
@SessionScoped
@Named("selected")
public class SelectedSupplier implements Serializable
{
	@Inject private SupplierService suppServ;
	private Supplier selectedSupplier;

	public Supplier getSelectedSupplier(){
		return selectedSupplier;
	}
	public void setSelectedSupplier(Supplier selectedSupplier){
		this.selectedSupplier = selectedSupplier;
		selectedSupplier=suppServ.findSupplierById(selectedSupplier.getId());
	}
	
	
}