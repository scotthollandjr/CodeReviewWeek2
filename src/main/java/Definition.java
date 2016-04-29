
import java.util.ArrayList;

public class Definition {
  private String mParts;
  private String mDefintition;
  private static ArrayList<Definition> definitions = new ArrayList<Definition>();
  private int mId;

  public Definition(String parts, String definition) {
    mParts = parts;
    mDefintition = definition;
    definitions.add(this);
  }

  public static ArrayList<Definition> all() {
    return definitions;
  }
}
