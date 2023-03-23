
/**
 * Write a description of class Honda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Honda extends Car
{
    // instance variables - replace the example below with your own
    private int age;

    /**
     * Constructor for objects of class Honda
     */
    public Honda(String name, int cylinders,int age)
    {
        super(name,cylinders);
        this.age = age;
    }
    public Honda()
    {
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
