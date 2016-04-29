import java.util.ArrayList;

public class Word {
  private static ArrayList<Word> dictionary = new ArrayList<Word>();

  private String mWord;
  private int mId;
  private ArrayList<Definition> mDefinitions;

  public Word(String word) {
    mWord = word;
    dictionary.add(this);
    mId = dictionary.size();
    mDefinitions = new ArrayList<Definition>();
  }

  public static ArrayList<Word> allWords() {
    return dictionary;
  }
}
