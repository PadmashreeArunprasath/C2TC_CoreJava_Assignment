package assignment_one.com.padma.assignment.employees;

public class Employee {
	 private String name;
	    private int employeeId;
	    private double salary;

	    /**
	     * Constructor to initialize Employee.
	     * @param name Name of the employee
	     * @param employeeId Employee ID
	     * @param salary Salary of the employee
	     */
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public double getSalary() {  // Protected so subclasses/utilities can access
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
}
