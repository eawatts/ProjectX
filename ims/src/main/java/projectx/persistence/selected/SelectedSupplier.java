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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject private SupplierService suppServ;
	private Supplier selectedSupplier;
	/**
	 * @return the selectedSupplier
	 */
	public Supplier getSelectedSupplier()
	{
		return selectedSupplier;
	}
	/**
	 * @param selectedSupplier the selectedProduct to set
	 */
	public void setSelectedSupplier(Supplier selectedSupplier)
	{
		this.selectedSupplier = selectedSupplier;
	}
	
	
}