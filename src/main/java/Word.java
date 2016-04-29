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

  public String getWord() {
    return mWord;
  }

  public int getId() {
    return mId;
  }

  public static void clear() {
    dictionary.clear();
  }

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }
}
