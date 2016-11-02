package projectx.persistence.selected;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import projectx.persistence.entities.Supplier;


@SessionScoped
@Named("selectedSup")
public class SelectedSupplier implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Supplier selectedSupplier;
	
	public Supplier getSelectedSupplier(){
		return selectedSupplier;
	}
	public void setSupplier(Supplier supplier){
		this.selectedSupplier=supplier;
	}
	 
}
