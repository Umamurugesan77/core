package core;

public class Employee {
	String firstname;
	String lastname;
	double salary;
	
public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}

public static void main(String args[])
	{
		Employee e1 = new Employee();
		e1.setFirstname("uma");
		e1.setLastname("maheswari");
		e1.setSalary(100000);
		Employee e2 = new Employee();
		e2.setFirstname("durka");
		e2.setLastname("devi");
		e2.setSalary(200000);
		double salary = e1.getSalary()*1.1;
		
		
		
		System.out.println(e1.getFirstname());
		System.out.println(e1.getLastname());
        System.out.println(e1.getSalary());
        System.out.println(e2.getFirstname());
        System.out.println(e2.getLastname());
        System.out.println(e2.getSalary());
        System.out.println(salary);
	}
}

