package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

//Проверка перевода с русского на английский
class YandexTranslateTest {
    @Test
    void selenideSearchTest() {
        open("https://translate.yandex.com/");

        $("#fakeArea").setValue("Это автотест");

        $("html").shouldHave(text("This is an AutoTest"));
    }
}







