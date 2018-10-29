package example.jpa;
import javax.persistence.*;
import java.util.List;
public class EmployeeService {

	protected EntityManager em;

	public EmployeeService(EntityManager em){
		this.em=em;
	}

	public Employee createEmployee(String name,int salary, Address address,Country country){

		Employee emp = new Employee();
		emp.setName(name);
		emp.setSalary(salary);
		emp.setAddress(address);//edited
		emp.setCountry(country);
		//em.persist(emp); // insert into table (CRUD operations are written here -> replacing the repository)
		em.merge(emp);
		return emp;
	}

	public void removeEmployee(int id){
		Employee emp = findEmployee(id);// if return null, do nothing else remove the employee
		if(emp !=null){
			em.remove(emp);
		}
	}

	public Employee raiseEmployeeSalary(int id, int raise){
		Employee emp = findEmployee(id);
		if(emp !=null){
			emp.setSalary(emp.getSalary()+raise);//updating the table based on the id with the amount to be raised
		}
		return emp;
	}

	public List<Employee> findAllEmployees(){
		TypedQuery<Employee> query = em.createQuery("Select e from Employee e",Employee.class);//will have a list with the employees created and inserted
		// JPA query language (employee is the name of the class and not the table name)
		return query.getResultList();

	}
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return em.find(Employee.class, id); //id = to whichever number we want
	}
	
	public Country createCountry(int id, String name){
		Country country = new Country(id,name);
		em.persist(country);
		return country;
	}
	
	public Country setCitiesOnCountry(int id, List<City> cities){
		Country country = findCountry(id);
		country.setCity(cities);
		em.persist(country);
		return country;
	}
	
	public Country findCountry(int id){
		return em.find(Country.class, id);
	}

}
