import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args [] ){
        Car mitsu = new Mitsubishi ("Outlander VRX 4WD",4,5);
        // in this method we called the parent class and will overide to the child class which the mitsubishi
        //runtime polymorphism 
        mitsu.startEngine();
        mitsu.accelerated();
        mitsu.brake();
        
        System.out.println();
        Car ford = new Ford ("Ford Falcon",4,7);
        //runtime polymorphism
        ford.startEngine();
        ford.accelerated();
        ford.brake();
        
        System.out.println();
        Honda honda = new Honda ("Honda BR-V",4,9);
        //compile-time polymorphism 
        honda.startEngine();
        honda.accelerated();
        honda.brake();
    }
}
