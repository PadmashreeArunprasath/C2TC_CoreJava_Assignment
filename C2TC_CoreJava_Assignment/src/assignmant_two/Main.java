package assignmant_two;

public class Main {
	public static void main(String[] args) {
        // Student object -> default constructor message
        Student s = new Student();

        // Commission object
        Commission emp = new Commission();
        emp.acceptDetails();
        emp.calculateCommission();
    }
}
