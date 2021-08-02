package cogent.go.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private int id;
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;

}
