package projectx.persistence.webentities;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import projectx.persistence.entities.User;


@SessionScoped
@Named("current_session")
public class CurrentSession implements Serializable{

		private static final long serialVersionUID = 1L;
		private User user;
		
		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
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
		
}
