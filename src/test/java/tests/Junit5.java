package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Junit5 {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;

    }
    @Test
    void dataAppearsInOutputBlockTest() {
        open("https://github.com/selenide/selenide");
        $(".main-header").shouldHave(text("Practice Form"));

    }

}