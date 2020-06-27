import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class TestAssertJSimple {
    @Test
    public void testAsserts(){
        String text = "abc";
        assertThat(text).isEqualTo("abc");

        String[] stringArray = {"abc", "cde", "efg"};
        assertThat(stringArray)
                .hasSize(3)
                .contains("cde")
                .doesNotContain("xyz");
    }
}