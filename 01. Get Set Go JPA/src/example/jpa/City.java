package example.jpa;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class City {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String city;
	@ManyToOne (cascade = CascadeType.ALL)
	private Country country;
	
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public City(String city) {
		super();
		this.city = city;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", city=" + city + ", country=" + country
				+ "]";
	}

		
}
