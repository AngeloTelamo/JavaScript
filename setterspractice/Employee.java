public class Employee extends Person {
    private String employeeId;
    
    public Employee(String name, String gender, int age, address address, String employeeId) {
        super(name, gender, age, address);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

}