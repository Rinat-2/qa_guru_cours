package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

//Тест на создание временного почтового ящика
class GoogleTest1 {
    @Test
    void selenideSearchTest() {
        // Открыть google и ввести Temp mail в поиск
        open("https://google.com");
        $(byName("q")).setValue("Temp mail").pressEnter();

        // Открыть сайт временной почты и создать свою собственную почту
        $("#search a[href='http://temp-mail.org/en/']").click();
        $(byId("click-to-change")).click();
        $(byId("new_mail")).setValue("test").click();
        $(byId("postbut")).click();

        // Проверить, что Temp Mail создал ту почту, которую мы хотели
        $(byId("mail")).shouldHave(value("test@ainbz.com"));
    }
}

//Тест для проверки поиска
class GoogleTest2 {
    @Test
    void selenideSearchTest() {
        open("https://google.com");

        $(byName("q")).setValue("Sulpak").pressEnter();
        $("#search a[href='https://www.sulpak.kz/']").click();
        $(byId("searchQuery")).setValue("Компьютер").pressEnter();

        $("html").shouldHave(text("Компьютер"));
    }
}

//Тест для входа на сайт chess.com
class GoogleTest3 {
    @Test
    void selenideSearchTest() {
        open("https://google.com");

        $(byName("q")).setValue("Chesscom").pressEnter();
        $("#search a[href='https://www.chess.com/']").click();
        $("a[href='https://www.chess.com/login_and_go?returnUrl=https%3A%2F%2Fwww.chess.com%2F']").click();
        $(byId("username")).setValue("Rinat_A");
        $(byId("password")).setValue("sdchound322");
        $(byId("login")).click();

        $("html").shouldHave(text("Rinat_A"));
    }
}

//Проверка перевода с русского на английский
class GoogleTest4 {
    @Test
    void selenideSearchTest() {
        open("https://google.com");

        $(byName("q")).setValue("yandex translate").pressEnter();
        $("#search a[href='https://translate.yandex.com/']").click();
        $(byId("srcLangButton")).click();
        $(byId("fakeArea")).setValue("Это автотест");

        $("html").shouldHave(text("This is an AutoTest"));
    }
}

//Добавление товара в корзину
class GoogleTest5 {
    @Test
    void selenideSearchTest() {
        open("https://google.com");

        $(byName("q")).setValue("Флип").pressEnter();
        $("#search a[href='https://www.flip.kz/").click();
        $(byId("search_input")).setValue("ssd samsung").pressEnter();
        $(byId("cart_button_1279064")).click();

        $("html").shouldHave(text("Товар добавлен в корзину"));
    }
}





