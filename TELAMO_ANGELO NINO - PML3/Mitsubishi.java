
/** 
 * Child Class<>
 * The other three classes mentioned above are sub-classes of Car. 
 * These classes have one member variable (age) and the constructor 
 * for each will call the parent constructor for object instantiation.
 *
 * Angelo Nino S. Telamo
 * Subject: IntProg32
 * Date : 3/22/2023 
 */
public class Mitsubishi extends Car
{
    // instance variables - replace the example below with your own
    private int age;

    /**
     * Constructor for objects of class Mitsubishi
     */
    public Mitsubishi(String name, int cylinders,int age)
    {
        super(name,cylinders);
        this.age = age;
    }
    public Mitsubishi()
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
