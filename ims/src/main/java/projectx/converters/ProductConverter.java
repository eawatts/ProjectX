package projectx.converters;

import javax.enterprise.context.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Product;
import projectx.services.ProductService;

@RequestScoped
@Named("product_converter")
public class ProductConverter implements Converter {

	@Inject
	private ProductService productService;

	@Override
	public Object getAsObject(FacesContext context, UIComponent uiComponent, String value) {
		if (value == null || value.isEmpty()) {
			return null;
		}
		try {
			return productService.findProductById(Integer.parseInt(value));
		} catch (NumberFormatException e) {
			System.out.println("EXCEPTION : NumberFormat : " + e.getMessage());
			return null;
		} catch (Exception e) {
			System.out.println("EXCEPTION : " + e.getMessage());
			return null;
		}
	}

	@Override
	public String getAsString(FacesContext context, UIComponent uiComponent, Object value) {
		if (value == null) {
			return "";
		}
		if (value instanceof Product) {
			return String.valueOf(((Product) value).getId());
		}
		return null;
	}
}
