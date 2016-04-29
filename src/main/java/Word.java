import java.util.ArrayList;

public class Word {
  private static ArrayList<Word> dictionary = new ArrayList<Word>();

  private String mWord;
  private int mId;
  private static ArrayList<Definition> mDefinitions;

  public Word(String word) {
    mWord = word;
    dictionary.add(this);
    mId = dictionary.size();
    mDefinitions = new ArrayList<Definition>();
  }

  public static ArrayList<Word> allWords() {
    return dictionary;
  }

  public String getWord() {
    return mWord;
  }

  public int getId() {
    return mId;
  }

  public static void clear() {
    dictionary.clear();
  }

  public static ArrayList<Definition> getDefinitions() {
    return mDefinitions;
  }

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }

  public static Word find(int id) {
    try {
      return dictionary.get(id - 1);
    } catch (IndexOutOfBoundsException exception) {
      return null;
    }
  }
}
