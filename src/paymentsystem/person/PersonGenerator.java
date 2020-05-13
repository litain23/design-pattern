package paymentsystem.person;

public class PersonGenerator {
    private static long id = 1;

    public static Person generatePerson(String name) {
        if(name == null) throw new NullPointerException("Person name is not null");

        Person person = new Person(id, name);
        id++;
        return person;
    }
}
