import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }

    @Test
    void automationPracticeForm() {
        open("https://github.com/selenide/selenide/wiki");

        $(".Box-row", 14).scrollIntoView(false);
        // $("#wiki-pages-box").$(withText("more pages")).click();
        $(".wiki-more-pages-link").$(".mx-auto").scrollTo().click();
        $(".Box-row", 16).click();

        //--------- Check ---------

        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }


}
