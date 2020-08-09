package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

//Тест для проверки поиска
class SulpakSearchTest {
    @Test
    void selenideSearchTest() {
        open("https://www.sulpak.kz/");

        $(byId("searchQuery")).setValue("Компьютер").pressEnter();

        $("html").shouldHave(text("Компьютер"));
    }
}