package example.jpa;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	private String country;
	@OneToMany (cascade = CascadeType.ALL)
	private List<City> city;
	
	public Country() {}

	public Country(int id, String country) {
		super();
		this.id = id;
		this.country = country;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public List<City> getCity() {
		return city;
	}

	public void setCity(List<City> city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", country=" + country + ", city=" + city
				+ "]";
	}
	
}
