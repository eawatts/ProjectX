package projectx.controllers;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projectx.persistence.repositories.hibernate.database.HibernateDatabase;

@Named("database")
@RequestScoped
public class DatabaseController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	HibernateDatabase database;
	
	public String seed() {
		database.seedDatabase();
		return null;
	}
}
