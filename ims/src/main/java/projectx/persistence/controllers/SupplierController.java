package projectx.persistence.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.inject.Named;

import projectx.persistence.entities.Supplier;
import projectx.persistence.selected.SelectedSupplier
import projectx.persistence.services.SupplierService;

@Named("suppliers")
@SessionScoped
public class SupplierController implements Serializable
{
	private SupplierService supplierService;
	private SelectedSupplier selectedSupplier;
	@SuppressWarnings("unused")
	private int selectedSupplierIndex;
	private DataModel<Supplier> dataModel = null;
	
}