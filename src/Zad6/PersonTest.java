package Zad6;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("Jan", 20);
        Person person2 = new Person("Kasia", 22);
        //nieprawidlowy
       // person1.personNumber = 2;
        //Person.personNumber = 3;
        System.out.println(Person.getPersonNumber());

    }
}
