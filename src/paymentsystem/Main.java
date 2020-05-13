package paymentsystem;

import paymentsystem.person.Person;
import paymentsystem.person.PersonGenerator;

public class Main {
    public static void main(String[] args) {
        Person person1 = PersonGenerator.generatePerson("아무개");
        Person person2 = PersonGenerator.generatePerson("아무개");

        System.out.println(person1);
        System.out.println(person2);

        if(person1.equals(person2)) {
            System.out.println("same person");
        } else {
            System.out.println("different person");
        }
    }
}
