package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Junit5 {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;

    }
    @Test
    void Junit5CodeAppearsInSoftAssertions() {
        //Открыть страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //Перейти в раздел Wiki проекта
        $(byText("Wiki")).click();
        //Убедится, что в списке страниц (Pages) есть страница SoftAssertions
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        //Открыть страницу SoftAssertions
        $(byText("SoftAssertions")).click();
        //проверить что внутри есть пример кода для JUnit5
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));
    }



}