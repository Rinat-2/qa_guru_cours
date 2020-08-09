package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

//Добавление товара в корзину
class FlipAddToCartTest {
    @Test
    void selenideSearchTest() {
        open("https://www.flip.kz/");

        $("#search_input").setValue("ssd samsung").pressEnter();
        $("#cart_button_1279064").click();

        $("html").shouldHave(text("Товар добавлен в корзину"));
    }
}
