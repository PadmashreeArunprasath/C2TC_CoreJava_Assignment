package assignment_one.com.padma.assignment.employees;

public class Developer extends Employee {
    private String programmingLanguage;

    /**
     * Constructor to initialize Developer.
     * @param name Name of the developer
     * @param employeeId Employee ID
     * @param salary Salary of the developer
     * @param programmingLanguage Main programming language used by the developer
     */
    public Developer(String name, int employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Getter and Setter
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
}
