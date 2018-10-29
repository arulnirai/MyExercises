package example.jpa;

import javax.persistence.CascadeType;
import javax.persistence.Entity; //use JPA specification
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//use JPA specification
import javax.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String addressLine;
	@OneToOne (cascade = CascadeType.ALL)
	private Country country;
	
	
	public Address() {
		super();
	}
	
	public Address(String addressLine){
		this.addressLine = addressLine;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAddressLine() {
		return addressLine;
	}
	
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", addressLine=" + addressLine
				+ ", country=" + country + "]";
	}

	
	
	
}
