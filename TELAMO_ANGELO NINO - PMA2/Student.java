/**
 * Is a subclass of Parent class which is Person. the fields contains of student major fields
 * of study and grade average as well as methods that override the person methods to accepts
 * and display these aditionnal informations
 *
 * Angelo Nino S. Telamo
 * IntProg32 - 74668
 * Schedule: Friday 1:30 - 4:30 pm
 * Date: 3/23/23
 */
public class Student extends Person
{
    // instance variables - replace the example below with your own
    private String MajorFields;
    private int grades;

    /**
     * Constructor for objects of class Student
     */
    public void Student(String firstname, String lastname, String address, int zipcode, int phoneNumber, String MajorFields, int grades)
    {
        // initialise instance variables
        super.Person(firstname, lastname, address, zipcode,phoneNumber);
        this.MajorFields = MajorFields;
        this.grades = grades;        
    }
    public Student(){
        this.MajorFields = " ";
        this.grades = 0;
    }
     //once we done the declare the objects in constructor 
    //now the time we set objects setters and getters
    //Major Fields
    public void setMajorField(String MajorFields){
        this.MajorFields = MajorFields;
    }
    public String getMajorField(){
        return MajorFields;
    }
    //grades    
    public void setGrades(int grades){
        this.grades = grades;
    }
    public int getGrade(){
        return grades;
    }
    
}
