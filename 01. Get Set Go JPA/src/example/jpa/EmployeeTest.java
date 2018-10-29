package example.jpa;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello"); //create the factory (must enter the 
																					//persistent name (line 7 of persistence.xml))
		EntityManager em = emf.createEntityManager();//use the factory to create the manager
		EmployeeService service = new EmployeeService(em);
		em.getTransaction().begin();
		City cit1 = new City("Bugic");
		City cit2 = new City("Kallang");
		City cit3 = new City("Expo");
		Country coun1 = service.createCountry(1, "Singapore");
		Country coun2 = service.createCountry(2, "India");
		Employee emp = service.createEmployee("Jane", 50000, new Address("Bendemeer"),coun1);
		Employee emp1 = service.createEmployee("Rita", 30000, new Address("Ubi"), coun2);
		Employee emp2 = service.createEmployee("Renee", 70000, new Address("Kaki"), coun2);
		coun1 = service.findCountry(1);
		coun2 = service.findCountry(2);
		List<City> city1 = new ArrayList<City>();
		List<City> city2 = new ArrayList<City>();
		city1.add(cit1);
		city2.add(cit2);
		city2.add(cit3);
		service.setCitiesOnCountry(1, city1);
		service.setCitiesOnCountry(2, city2);
		
		em.getTransaction().commit();
		System.out.println("Persisted "+emp);
		
		emp= service.findEmployee(1);
		System.out.println("Found "+emp);
		
		em.getTransaction().begin();//can put the begin and commit in the service class
		emp =service.raiseEmployeeSalary(1, 20000);
		em.getTransaction().commit();
		System.out.println("Updated "+emp);
		
		List<Employee> employees = service.findAllEmployees();
		System.out.println("All"+employees);
		
		em.close();
		emf.close();
	}

}
