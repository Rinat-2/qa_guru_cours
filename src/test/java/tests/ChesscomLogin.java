package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

//Тест для входа на сайт chess.com
class ChesscomLoginTest {
    @Test
    void selenideSearchTest() {
        open("https://www.chess.com/");

        $("a[href='https://www.chess.com/login_and_go?returnUrl=https%3A%2F%2Fwww.chess.com%2F']").click();
        $(byId("username")).setValue("Rinat_A");
        $(byId("password")).setValue("sdchound322");
        $(byId("login")).click();

        $("html").shouldHave(text("Rinat_A"));
    }
}
