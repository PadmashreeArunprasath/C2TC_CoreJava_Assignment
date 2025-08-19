package assignment_one.com.padma.assignment.employees;

public class Manager extends Employee {
    private String department;

    /**
     * Constructor to initialize Manager.
     * @param name Name of the manager
     * @param employeeId Employee ID
     * @param salary Salary of the manager
     * @param department Department managed by the manager
     */
    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    // Getter and Setter
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
