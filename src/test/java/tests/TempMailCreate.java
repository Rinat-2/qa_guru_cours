package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

//Тест на создание временного почтового ящика
class TempMailCreateTest {
    @Test
    void selenideSearchTest() {
        open("http://temp-mail.org/en/");

        $(byId("click-to-change")).click();
        $(byId("new_mail")).setValue("test").click();
        $(byId("postbut")).click();

        $(byId("mail")).shouldHave(value("test@ainbz.com"));
    }
}