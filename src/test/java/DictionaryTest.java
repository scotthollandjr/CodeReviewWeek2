import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class DictionaryTest {

  @Test
  public void  Dicitionary_instantiatesCorrectly_true() {
    Dictionary testDiction = new Dictionary("Nachos");
    assertEquals(true, testDiction instanceof Dictionary);
  }
}
