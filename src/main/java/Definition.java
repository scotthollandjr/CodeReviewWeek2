
import java.util.ArrayList;

public class Definition {
  private String mParts;
  private String mDefinition;
  private static ArrayList<Definition> definitions = new ArrayList<Definition>();
  private int mId;

  public Definition(String parts, String definition) {
    mParts = parts;
    mDefinition = definition;
    definitions.add(this);
  }

  public static ArrayList<Definition> all() {
    return definitions;
  }

  public String getParts() {
    return mParts;
  }

  public String getDefinition() {
    return mDefinition;
  }
}
