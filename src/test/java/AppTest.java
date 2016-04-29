import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.*;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Welcome to the Dictionary!");
  }

  @Test
  public void addWordPage() {
    goTo("http://localhost:4567/");
    click("a", withText("Add a new word!"));
    assertThat(pageSource()).contains("Add a word to the dictionary");
  }

  @Test
  public void successWordPage() {
    goTo("http://localhost:4567/");
    click("a", withText("Add a new word!"));
    fill("#word").with("Appa");
    submit(".btn");
    assertThat(pageSource()).contains("Your word has been added to the dictionary.");
  }

  @Test
  public void successfullyAddWord() {
    goTo("http://localhost:4567/");
    click("a", withText("Add a new word!"));
    fill("#word").with("Appa");
    submit(".btn");
    click("a", withText("Return Home"));
    assertThat(pageSource()).contains("Appa");
  }

  @Test
  public void successfullyAddTwoWords() {
    goTo("http://localhost:4567/");
    click("a", withText("Add a new word!"));
    fill("#word").with("Appa");
    submit(".btn");
    click("a", withText("Return Home"));
    click("a", withText("Add a new word!"));
    fill("#word").with("Breakfast");
    submit(".btn");
    click("a", withText("Return Home"));
    assertThat(pageSource()).contains("Appa");
    assertThat(pageSource()).contains("Breakfast");
  }

  @Test
  public void successfullyAddDefinitionPt1() {
    goTo("http://localhost:4567/");
    click("a", withText("Add a new word!"));
    fill("#word").with("Appa");
    submit(".btn");
    click("a", withText("Return Home"));
    click("a", withText("Appa"));
    click("a", withText("Add a new definition"));
    fill("#definition").with("A siamese cat");
    submit(".btn");
    assertThat(pageSource()).contains("Your definition has been added!");
  }

  @Test
  public void successfullyAddDefinitionPt2() {
    goTo("http://localhost:4567/");
    click("a", withText("Add a new word!"));
    fill("#word").with("Appa");
    submit(".btn");
    click("a", withText("Return Home"));
    click("a", withText("Appa"));
    click("a", withText("Add a new definition"));
    fill("#definition").with("A siamese cat");
    submit(".btn");
    click("a", withText("Return Home"));
    click("a", withText("Appa"));
    assertThat(pageSource()).contains("A siamese cat");
  }
}
