
/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person {
    private String studentNumber;

    public Student(String name, String gender, int age, address address, String studentNumber) {
        super(name, gender, age, address);
        this.studentNumber = studentNumber;
    }

    public Student() {
        super();
        this.studentNumber = "";
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
