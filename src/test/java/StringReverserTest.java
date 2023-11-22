import static org.junit.Assert.*;
import org.junit.Test;

public class StringReverserTest {
    @Test
    public void shouldReverseString() {
        StringReverser reverser = new StringReverser();
        assertEquals("dcba", reverser.reverse("abcd"));
    }
}