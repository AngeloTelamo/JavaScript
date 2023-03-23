/**
 * Parent Class<>
 * create four classes of vehicles. The first class should be named Car. 
 * This will be the base class
 * for three other classes, Mitsubishi, Honda, and Ford.
 *
 * Angelo Nino S. Telamo
 * Subject: IntProg32
 * Date : 3/22/2023 
 */
public class Car
{
    // instance variables - replace the example below with your own
    private String name;
    private boolean engine = true; //set into true
    private int cylinders;
    private int wheels = 4;

    /**
     * Constructor for objects of class CAR
     */
    public Car(String name,int cylinders)
    {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }
    public Car()
    {
        this.name = " ";
        this.engine = false;
        this.cylinders = 0;
        this.wheels = 0;
    }
    
     /**
     * setters and getters of name, wheels and cylinders
     */
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }
    public int getWheels(){
        return wheels;
    }
        public void setCylinders(int cylinders){
        this.cylinders = cylinders;
    }
    public int geCylinders(){
        return cylinders;
    }

    /**
     * methods of startengine
     */
    public void startEngine(){
        System.out.println(name + " engine is starting.");
    }
    
    /**
     * methods of accelerate
     */
    public void accelerated(){
        System.out.println(name + " is accelerating engine.");
    }
    
    /**
     * methods of braking
     */
    public void brake(){
        System.out.println(name + " is braking engine.");
    }
}
