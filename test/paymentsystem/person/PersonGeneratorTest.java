package paymentsystem.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonGeneratorTest {

    @Test
    public void 사람_객체_생성_ok() {
        String name = "아무개";
        Person person = PersonGenerator.generatePerson(name);

        assertEquals(name, person.getName());
        assertEquals(1, person.getId());
    }

    @Test
    public void 사람_객체_이름_null_expect_NullPointerException() {
        String name = null;

        assertThrows(NullPointerException.class, () -> {
            Person person = PersonGenerator.generatePerson(name);
        });
    }
}
