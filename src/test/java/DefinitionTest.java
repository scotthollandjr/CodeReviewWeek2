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

  @Test
  public void all_arrayContainsMultiple_Array() {
    Definition testOne = new Definition("Noun", "A mexican dish");
    Definition testTwo = new Definition("Verb", "To eat nachos");
    assertTrue(Definition.all().contains(testOne));
    assertTrue(Definition.all().contains(testTwo));
  }

  @Test
  public void getParts_returnsString_String() {
    Definition testDefinition = new Definition("Noun", "A mexican dish");
    assertEquals("Noun", testDefinition.getParts());
  }

  @Test
  public void getDefinition_returnsString_String() {
    Definition testDefinition = new Definition("Noun", "A mexican dish");
    assertEquals("A mexican dish", testDefinition.getDefinition());
  }
}
