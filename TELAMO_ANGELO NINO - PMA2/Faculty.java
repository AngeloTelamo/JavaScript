
/**
 * Is a subclass of parent class which is CollegeEmployee. This class also includes Boolean
 * fields that indicates whether the Faculty Member is tenured as well as methods that override
 * the CollegeEmployee methods to accept and display this additional piece of informations
 * 
 *
*  Angelo Nino S. Telamo
 * IntProg32 - 74668
 * Schedule: Friday 1:30 - 4:30 pm
 * Date: 3/23/23
 */
public class Faculty extends CollegeEmployee
{    private boolean Tenured;
    
    public void Faculty (boolean Tenured,String firstname, String lastname, String address, int zipcode, int phoneNumber, int sssNumber, int salary, String departmentName){
        super.CollegeEmployee(firstname,lastname, address,zipcode, phoneNumber, sssNumber, salary, departmentName);
        this.Tenured = Tenured;
    }
    //once we done the declare the objects in constructor 
    //now the time we set objects setters and getters
    /**
     * Setters and Getters for objects of class Faculty
     */
    public void setTenured(boolean Tenured){
        this.Tenured = Tenured;
    }
    public boolean getTenured(){
        return Tenured;
    }
}
