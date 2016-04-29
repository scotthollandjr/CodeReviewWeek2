
import java.util.ArrayList;

public class Definition {
  private String mDefinition;
  private static ArrayList<Definition> definitions = new ArrayList<Definition>();
  private int mId;

  public Definition(String definition) {
    mDefinition = definition;
    definitions.add(this);
  }

  public static ArrayList<Definition> all() {
    return definitions;
  }

  public String getDefinition() {
    return mDefinition;
  }
}
