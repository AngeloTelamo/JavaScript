/**
 * The parent class is Person contains the first name,last name, street address, zip code and phone
 * number. The class also contains a methods that sets data field, using a series of
 * dialog boxes input prompts and a display method that all informations on a single
 * line at the command line on screen.
 *
 * Angelo Nino S. Telamo
 * IntProg32 - 74668
 * Schedule: Friday 1:30 - 4:30 pm
 * Date: 3/23/23
 */
public class Person
{
    // instance variables - replace the example below with your own
    private String firstname;
    private String lastname;
    private String address;
    private int zipcode;
    private int phoneNumber;  

    /**
     * Constructor for objects of class Person
     */
    public void Person(String firstname, String lastname, String address, int zipcode, int phoneNumber)
    {
      this.firstname = firstname;
      this.lastname = lastname;
      this.address = address;
      this.zipcode = zipcode;
      this.phoneNumber = phoneNumber;        
    }
    public Person(){
        firstname = " " ;
        lastname = " ";
        address = " ";
        zipcode = 0;
        phoneNumber = 0;
    }
    //once we done the declare the objects in constructor 
    //now the time we set objects setters and getters
    /**
     * Setters and Getters for objects of class Person
     */
    //firstname
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getFirstname(){
        return this.firstname;
    }
    //lastname
      public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getLastname(){
        return lastname;
    }
    //address
      public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    //zipcode
      public void setZipcode(int zipcode){
        this.zipcode = zipcode;
    }
    public int getZipcode(){
        return zipcode;
    }
    //phonenumber
      public void setPhonenumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }   
}
