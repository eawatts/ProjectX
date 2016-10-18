package projectx.persistence.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.inject.Named;

import projectx.persistence.entities.Supplier;

@Named("suppliers")
@SessionScoped
public class SupplierController implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8543095349528556129L;
	@SuppressWarnings("unused")
	private int selectedSupplierIndex;
	private DataModel<Supplier> dataModel = null;
	
	public DataModel<Supplier> getDataModel() {
		return dataModel;
	}
	public void setDataModel(DataModel<Supplier> dataModel) {
		this.dataModel = dataModel;
	}
	
}