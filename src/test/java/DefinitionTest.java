import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("Noun", "A mexican dish");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void all_returnsArray_Array() {
    Definition testDefinition = new Definition("Noun", "A mexican dish");
    assertTrue(Definition.all().contains(testDefinition));
  }
}
