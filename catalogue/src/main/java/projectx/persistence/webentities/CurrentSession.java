package projectx.persistence.webentities;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import projectx.persistence.entities.User;

import java.io.Serializable;

@SessionScoped
@Named("current_session")
public class CurrentSession implements Serializable {

	private static final long serialVersionUID = 1L;

	private User user;
	private Basket basket;
	
	private String urlRedirect; // Used to store a page to redirect to after an event (login for example).

	@PostConstruct
	private void setupCurrentSession(){
		this.basket = new Basket();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Basket getBasket() {
		return basket;
	}

	public void setBasket(Basket basket) {
		this.basket = basket;
	}

	public String getUserFirstName() {
		return this.user.getFirstname();
	}

	public boolean isLoggedIn() {
		return (user == null) ? false : true;
	}

	public void logout() {
		this.user = null;
	}
	
	public String getUrlRedirect() {
		return urlRedirect;
	}

	public void setUrlRedirect(String urlRedirect) {
		this.urlRedirect = urlRedirect;
	}
}
