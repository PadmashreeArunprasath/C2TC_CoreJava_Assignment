package assignment_one.com.padma.assignment.utilities;


import assignment_one.com.padma.assignment.employees.Employee;

	/**
	 * Utility class for performing operations on Employee objects.
	 */
public class EmployeeUtilities {

	    /**
	     * Prints the details of an employee.
	     * Demonstrates usage of protected and public access modifiers.
	     * @param employee The employee whose details are to be printed
	     */
	    public static void printEmployeeDetails(Employee employee) {
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Employee ID: " + employee.getEmployeeId());
	        // Accessing salary via protected getter
	        System.out.println("Salary: " + employee.getSalary());
	    }

	    /**
	     * Increases the salary of an employee by a given percentage.
	     * @param employee The employee whose salary will be updated
	     * @param percentage Percentage increase
	     */
	    public static void increaseSalary(Employee employee, double percentage) {
	        double newSalary = employee.getSalary() + (employee.getSalary() * percentage / 100);
	        employee.setSalary(newSalary);
	    }
}
