package example.jpa;


import javax.persistence.*;
@Entity //create the table name employee
public class Employee {

	@Id //determines the primary key (in this case ID)
	@GeneratedValue (strategy = GenerationType.AUTO)//to auto generate the ID
	private int id;
	private String name;
	private int salary;
	@OneToOne (cascade=CascadeType.ALL) //one employee has one address
	private Address address;
	private Country country;


	public Employee(){
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", address=" + address + "]";
	}

	
	
}
