package projectx.persistence.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Supplier;
import projectx.persistence.repositories.offline.SupplierRepositoryOffline;

@Named("suppliers")
@SessionScoped
public class SupplierController implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject 
	private SupplierRepositoryOffline suppRepo;
	private Supplier supplier;
	private int selectedSupplier;
	private DataModel<Supplier> dataModel = null;
	
	private void recreateModel() {
		dataModel= null;
		}
	
	public DataModel<Supplier> createDataModel(){
		if(suppRepo.getSuppliers() != null){
			return new ListDataModel<Supplier>(suppRepo.getSuppliers());
		}
		return dataModel;
	}
	public DataModel<Supplier> getDataModel(){
		if(dataModel==null)
			dataModel=createDataModel();
			return dataModel;
	}
	public String  getSupplier(int id)
	{
		return suppRepo.findBySupplierId(Integer.toString(id).toString());
	}
	
}
