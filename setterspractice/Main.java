/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        // Create a new Address object
        address address = new address("Gov.Cuenco Avenue", "Barangay Talamban", "Cebu City");

        // Create a new Person object
        Person person = new Person("Angelo", "Male", 21, address);
        System.out.println ("PERSON");
        System.out.println("Name: " + person.getName());
        System.out.println("Student Gender: " + person.getGender());
        System.out.println("Student Age: " + person.getAge());
        System.out.println("Student Address: " + person.getAddress().getStreet() + ", " + person.getAddress().getBarangay() + ", " + person.getAddress().getCityMun());
        
        // Create a new student object                          
        Student student = new Student("Angelo", "Male", 21, address, "20569229");
        System.out.println ("\n STUDENT");
        System.out.println("Student Number: " + student.getStudentNumber());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Gender: " + student.getGender());
        System.out.println("Student Age: " + student.getAge());
        System.out.println("Student Address: " + student.getAddress().getStreet() + ", " + student.getAddress().getBarangay() + ", " + student.getAddress().getCityMun());
        // Create a new student object 
        Employee emp = new Employee("Bruce Lee", "Male", 48, address, "E001");
        System.out.println ("\nEMPLOYEE");
        System.out.println("Employee Number: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Gender: " + emp.getGender());
        System.out.println("Employee Age: " + emp.getAge());
        System.out.println("Employee Address: " + emp.getAddress().getStreet() + ", " + emp.getAddress().getBarangay() + ", " + emp.getAddress().getCityMun());
                
        Customer cust = new Customer("Scott Lang", "Male", 31, address, "C001");
        System.out.println ("\nCUSTOMER");
        System.out.println("Customer Number: " + cust.getCustomerId());
        System.out.println("Customer Name: " + cust.getName());
        System.out.println("Customer Gender: " + cust.getGender());
        System.out.println("Customer Age: " + cust.getAge());
        System.out.println("Customer Address: " + cust.getAddress().getStreet() + ", " + cust.getAddress().getBarangay() + ", " + cust.getAddress().getCityMun());
        
    }
}
