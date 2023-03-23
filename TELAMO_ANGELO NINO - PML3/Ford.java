
/**
 * Write a description of class Ford here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ford extends Car
{
    // instance variables - replace the example below with your own
    private int age;

    /**
     * Constructor for objects of class Ford
     */
    public Ford(String name, int cylinders,int age)
    {
        super(name,cylinders);
        this.age = age;
    }
    public Ford()
    {
        // initialise instance variables
        age = 0;
    }

    /**
     * Setters and getters of age 
     */
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    
    /**
     * methods of startengine
     */
    public void startEngine(){
        System.out.println(getName()+" is "+age+" years old."+getName() + " engine is starting.");
    }
    
    /**
     * methods of accelerate
     */
    public void accelerated(){
        System.out.println(getName() + " is accelerating engine.");
    }
    
    /**
     * methods of braking
     */
    public void brake(){
        System.out.println(getName() + " is braking engine.");
    }
}
