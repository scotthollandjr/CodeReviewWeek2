import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WordTest {
  @After
  public void tearDown() {
    Word.clear();
  }

  @Test
  public void Word_instanciatedCorrectly_true() {
    Word testWord = new Word("Nachos");
    assertEquals(true, testWord instanceof Word);
  }

  @Test
  public void allWords_returnsWord_Array() {
    Word testWord = new Word("Nachos");
    assertTrue(Word.allWords().contains(testWord));
  }

  @Test
  public void allWords_returnsMultipleWords_Array() {
    Word testOne = new Word("Nachos");
    Word testTwo = new Word("Eat");
    assertTrue(Word.allWords().contains(testOne));
    assertTrue(Word.allWords().contains(testTwo));
  }

  @Test
  public void getWord_returnsWord_String() {
    Word testWord = new Word("Nachos");
    assertEquals("Nachos", testWord.getWord());
  }

  @Test
  public void getId_wordsAreAssignedId_int() {
    Word testWord = new Word("Nachos");
    assertEquals(1, testWord.getId());
  }

  @Test
  public void getId_multWordsAreAssignedId_int() {
    Word testOne = new Word("Nachos");
    Word testTwo = new Word("Eat");
    assertEquals(2, testTwo.getId());
  }

  @Test
  public void getId_outOfBounds_null() {
    Word testWord = new Word("Nachos");
    assertEquals(null, Word.find(24));
  }
}
