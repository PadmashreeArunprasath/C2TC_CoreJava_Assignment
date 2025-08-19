package assignment_one;

import assignment_one.com.padma.assignment.employees.Manager;
import assignment_one.com.padma.assignment.employees.Developer;
import assignment_one.com.padma.assignment.utilities.EmployeeUtilities;

/**
 * The main class to demonstrate Employee, Manager, Developer, and EmployeeUtilities.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager and Developer objects
        Manager manager = new Manager("Alice", 101, 80000, "IT");
        Developer developer = new Developer("Bob", 102, 60000, "Java");

        // Print details before salary increment
        System.out.println("=== Before Salary Increment ===");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        // Increase salary
        EmployeeUtilities.increaseSalary(manager, 10);
        EmployeeUtilities.increaseSalary(developer, 15);

        // Print details after salary increment
        System.out.println("\n=== After Salary Increment ===");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }
}
