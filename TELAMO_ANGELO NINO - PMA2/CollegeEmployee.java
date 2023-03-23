/**
 * Is a subclass of parent class which is Person. That has object includes Social 
 * Security number, annual salary, and the department name,as well as the methods
 * that override the persons methods(use super()) to accept and display all the
 * collegeemployee data.
 *
 * Angelo Nino S. Telamo
 * IntProg32 - 74668
 * Schedule: Friday 1:30 - 4:30 pm
 * Date: 3/23/23
 */
public class CollegeEmployee extends Person
{
    // instance variables - replace the example below with your own
    private int sssNumber;
    private int salary;
    private String departmentName;

    /**
     * Constructor for objects of class CollegeEmployee
     */
    public void CollegeEmployee(String firstname, String lastname, String address, int zipcode, int phoneNumber, int sssNumber, int salary, String departmentName)
    {
        // initialise instance variables
        super.Person (firstname,lastname,address,zipcode,phoneNumber);
        this.sssNumber = sssNumber;
        this.salary = salary;
        this.departmentName = departmentName;
    }
    public CollegeEmployee(){
        this.sssNumber = 0;
        this.salary = 0;
        this.departmentName = " "; 
    }

    //once we done the declare the objects in constructor 
    //now the time we set objects setters and getters
    /**
     * Setters and Getters for objects of class CollegeEmployee
     */
    //social security number
    public void setSSSNumber(int sssNumber){
        this.sssNumber = sssNumber;
    }
    public int getSSSNumber(){
        return sssNumber;
    }
    // annual salary
    public void setSalary(int salary){
        this.salary= salary;
    }
    public int getSalary(){
        return salary;
    }
    //departmentName
    public void setDepartmentName(String departmentName){
        this.departmentName= departmentName;
    }
    public String getDepartmentName(){
        return departmentName;
    }
}
