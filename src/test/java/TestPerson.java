import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import sda.calculator.Person;

@RunWith(Parameterized.class)
public class TestPerson {
    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][]{
                {15},
                {55},
                {25},
                {8},
                {115},
                {17}
        });
    }

    @Parameterized.Parameter(0)
    public int age1;
//    @Parameterized.Parameter(1)
//    public int age2;

    @Test
    public void testIsTeenager() {
        Person person001 = new Person(age1);
        assert person001.isTeenager();
    }
    @Test
    public void testIsChild() {
        Person person001 = new Person(age1);
        assert person001.isChild();
    }
    @Test
    public void testIsAdult() {
        Person person001 = new Person(age1);
        assert person001.isAdult();
    }
    @Test
    public void testIsDead() {
        Person person001 = new Person(age1);
        assert person001.isGhost();
    }
}
