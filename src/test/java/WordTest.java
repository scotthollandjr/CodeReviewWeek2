import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WordTest {

  @Test
  public void Word_instanciatedCorrectly_true() {
    Word testWord = new Word("Nachos");
    assertEquals(true, testWord instanceof Word);
  }

}
