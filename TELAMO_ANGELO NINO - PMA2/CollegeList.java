import java.util.*;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollegeList
{
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        //sets of array of how many users will input in corresponding selections that have each own array
        CollegeEmployee[] emp = new CollegeEmployee[4];
        Faculty[] fac = new Faculty[3];
        Student[] std = new Student[7];
        
        //for counting how many users input will put 
        int employeeCount = 0;
        int studentCount = 0;
        int facultyCount = 0;
        
        String input = "";
        do {
            System.out.println("MENU");
            System.out.println("EMPLOYEE [E] or [e]");
            System.out.println("STUDENTS [S] or [s]");
            System.out.println("FACULTY MEMBER [F] or [f]");
            System.out.println("QUIT [Q] or [q]");
            input = sc.nextLine();
            switch (input.toUpperCase()) { //toUpperCase allow the users input lowercase and Uppercase
                case "E":
                    System.out.println("You selected College Employee.");
                    if (employeeCount < emp.length) {
                        for(int i = 0; i < emp.length; i++){
                            System.out.println("Enter employee First name:");
                            String first = sc.nextLine();
                            System.out.println("Enter employee Last name:");
                            String last = sc.nextLine();
                            System.out.println("Enter employee SSS number:");
                            int sssnumber = sc.nextInt();
                            System.out.println("Enter employee Enter Salary:");
                            int salary = sc.nextInt();
                            System.out.println("Enter employee Department Name:");
                            String departmentName = sc.nextLine();
                            System.out.println("Enter employee Address:");
                            String address = sc.nextLine();
                            System.out.println("Enter employee ZipCode:");
                            int zipcode = sc.nextInt();
                            System.out.println("Enter employee PhoneNumber:");
                            int phoneNumber = sc.nextInt();
                            CollegeEmployee Emp = new CollegeEmployee();
                            Emp.CollegeEmployee(first,last,address, zipcode, phoneNumber,sssnumber, salary, departmentName);
                            emp[i] = Emp;
                            employeeCount++;
                            System.out.print("\n");
                        }
                    } else {
                        System.out.println("Employee is at limit to 4.");
                    }
                    break;
                case "S":
                    System.out.println("You selected Students.");
                    if (studentCount < std.length){
                        for(int s = 0; s < std.length; s++){
                            System.out.println("Enter Major Field: ");
                            String majorfield = sc.nextLine();
                            System.out.println("Enter grade: ");
                            int grade = sc.nextInt();
                            
                            System.out.println("Enter Student First name:");
                            String first = sc.nextLine();
                            System.out.println("Enter Student Last name:");
                            String last = sc.nextLine();
                            System.out.println("Enter Student Address:");
                            String address = sc.nextLine();
                            System.out.println("Enter Student ZipCode:");
                            int zipcode = sc.nextInt();
                            System.out.println("Enter Student PhoneNumber:");
                            int phoneNumber = sc.nextInt();
                            Student student = new Student();
                            student.Student(first, last, address, zipcode, phoneNumber,majorfield, grade);
                            std[s] = student;
                            studentCount++;
                            System.out.print("\n");
                        }
                    }else{
                        System.out.println("Student is at limit to 7.");
                    }
                    break;
                case "F":
                        System.out.println("You selected Faculty Members. Are you tenured? (Y)es/(N)o");
                        String tenuredInput = sc.nextLine();
                        boolean Tenured;
                            if (tenuredInput.equalsIgnoreCase("Y")) {
                                Tenured = true;
                                System.out.println("You are a tenured faculty member.");
                                 if(facultyCount < fac.length){
                                  for(int f = 0; f < fac.length; f++){
                                        System.out.print("Enter first name: ");
                                        String first = sc.nextLine();
                                        System.out.print("Enter last name: ");
                                        String last = sc.nextLine();
                                        System.out.print("Enter address: ");
                                        String address = sc.nextLine();
                                        
                                        System.out.print("Enter zipcode: ");
                                        int zipcode = sc.nextInt();
                                        
                                        System.out.print("Enter phone number: ");
                                        int phoneNumber = sc.nextInt();
                                        
                                        System.out.print("Enter SSS number: ");
                                        int sss = sc.nextInt();
                                        
                                        System.out.print("Enter salary: ");
                                        int salary = sc.nextInt();
                                        
                                        System.out.print("Enter department name: ");
                                        String departmentName = sc.nextLine();
                                        
                                        sc.nextLine();
                                        
                                        Faculty faculty = new Faculty();
                                        //boolean Tenured,String firstname, String lastname, String address, int zipcode, int phoneNumber, int sssNumber, int salary, String departmentN
                                        faculty.Faculty (Tenured, first,last, address, zipcode, phoneNumber,sss, salary, departmentName);
                                        fac[f] = faculty;
                                        facultyCount++; 
                                        System.out.print("\n");
                                    }                    
                            } else {
                                System.out.println("Faculty is at limit to 3.");                            
                            }
                    }else if(tenuredInput.equalsIgnoreCase("N")) {
                            Tenured = false;
                            System.out.println("You are not a tenured faculty member.");
                    }
                    
                    break;
                case "Q":
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                
                //CollegeEmployee Display 
                if(employeeCount == 0)
                    System.out.println("Empty Sets of Data");
                else{
                    System.out.println("\nEmployees Informations");
                    for(int n = 0; n < employeeCount; n++){
                        System.out.println("Firstname: " + emp[n].getFirstname());
                        System.out.println("Lastname: " + emp[n].getLastname());
                        System.out.println("Address: " + emp[n].getAddress());
                        System.out.println("Zip Code: " + emp[n].getZipcode());
                        System.out.println("Phone Number: " + emp[n].getPhoneNumber());
                        System.out.println("SSS number: " + emp[n].getSSSNumber());
                        System.out.println("Salary: " + emp[n].getSalary());
                        System.out.println("Department name: " + emp[n].getDepartmentName());
                    }
                }
                
                //Students Display Output
                if(studentCount == 0)
                    System.out.println("Empty Sets of Data");
                else{
                    System.out.println("\nStudents Informations");
                    for(int n = 0; n < studentCount; n++){
                        System.out.println("Firstname: " + std[n].getFirstname());
                        System.out.println("Lastname: " + std[n].getLastname());
                        System.out.println("Address: " + std[n].getAddress());
                        System.out.println("Zip Code: " + std[n].getZipcode());
                        System.out.println("Phone Number: " + std[n].getPhoneNumber());
                        System.out.println("Major Fields: " + std[n].getMajorField());
                        System.out.println("Grades: " + std[n].getGrade());
                    }
                }
                
                //Faculty Members Output
                if(facultyCount == 0)
                    System.out.println("Empty Sets of Data");
                else{
                    System.out.println("\nFaculty Informations");
                    for(int n = 0; n < facultyCount; n++){
                        System.out.println("Firstname: " + fac[n].getFirstname());
                        System.out.println("Lastname: " + fac[n].getLastname());
                        System.out.println("Address: " + fac[n].getAddress());
                        System.out.println("Zip Code: " + fac[n].getZipcode());
                        System.out.println("Phone Number: " + fac[n].getPhoneNumber());
                        System.out.println("SSS number: " + fac[n].getSSSNumber());
                        System.out.println("Salary: " + fac[n].getSalary());
                        System.out.println("Department name: " + fac[n].getDepartmentName());
                    }
                }
                
            }
        }while(!input.equalsIgnoreCase("Q"));
    }
 }

