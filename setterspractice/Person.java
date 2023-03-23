import java.util.*;
/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person {
    private String name;
    private String gender;
    private int age;
    private address address;

    public Person(String name, String gender, int age, address address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public Person() {
        this.name = "";
        this.gender = "";
        this.age = 0;
        this.address = new address("", "", "");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }
}
