package projectx.controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.entities.Category;
import projectx.services.CategoryService;

@Named("category")
@RequestScoped
public class CategoryController {

	@Inject
	private CategoryService categoryService;

	public List<Category> getCategories() {

		return categoryService.getCategories();
	}

	public Category findByName(String name) {
		return categoryService.findByName(name);
	}

	public Category findByid(int id) {
		return categoryService.findByid(id);
	}
}
