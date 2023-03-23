import java.util.*;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String args[]){
            System.out.print('\003');
            Scanner sc = new Scanner(System.in);
            
            Person obj = new Person();
            
            String name = " "; 
            String gender = " ";
            int age = 0;
            
            //validation for names
            while(!name.matches("[a-zA-Z]+")){
                    System.out.println("Enter a name: ");
                    name = sc.nextLine();
                    obj.setName(); 
                    if (!name.matches("[a-zA-Z]+")) {
                            System.out.println("Invalid input. Please try again.");
                        }
            }    
            
            //validation for genders
            while (!gender.equals("male") && !gender.equals("female")) {
                  System.out.print("Enter your gender (male or female only): ");
                  gender = sc.nextLine();
                  obj.setGender();
                      if (!gender.equals("male") && !gender.equals("female")) {
                        System.out.println("Invalid gender. Please try again.");
                  }
                }  
                
            // validation for age
            while (age <= 0) {
                  System.out.print("Enter your age: ");
                  try {
                        age = Integer.parseInt(sc.nextLine());
                        obj.setAge();
                        if (age >= 3 && age <= 5) {
                          System.out.println("\nName: "+obj.getName(name));
                          System.out.println("Gender: "+obj.getGender(gender));
                          System.out.println("At the age of"+obj.getAge(age)+" you are not capable to walk "+ obj.getName(name));;
                        } else if (age >= 60) {
                            System.out.println("\nName: "+obj.getName(name));
                            System.out.println("Gender: "+obj.getGender(gender));
                          System.out.println("At the age of"+obj.getAge(age)+" you are not capable to run "+ obj.getName(name));
                        } else {
                            System.out.println("\nName: "+obj.getName(name));
                            System.out.println("Gender: "+obj.getGender(gender));
                            System.out.println("At the age of "+obj.getAge(age)+" you are capable to run and walk "+ obj.getName(name));
                        } 
                    
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please try again.");
                        sc.nextLine();
                  }
                }  
        }
 }

