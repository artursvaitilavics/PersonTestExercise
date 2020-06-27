import org.junit.Test;
import sda.calculator.Person;

public class TestPerson {
    @Test
    public void testIsTeenager() {
        Person person001 = new Person(15);
        assert person001.isTeenager();
        Person person002 = new Person(25);
        assert !person002.isTeenager();
    }
}
