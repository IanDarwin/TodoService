package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/** A user of the system.
 * JPA Entities cannot be Java 'record' types.
 */
@Entity
public class Person {

	@Id
	long id;

	public String username;

	public String passwdEncrypted;

	public String firstName;

	public String lastName;
}
