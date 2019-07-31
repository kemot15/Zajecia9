package Zad6;

public class Person {
    private String firstName;
    private  int age;
    private static int personNumber;

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
        personNumber++;
    }

    public static int getPersonNumber() {
        return personNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
