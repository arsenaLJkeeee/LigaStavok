package ru.ligastavok;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class LigaStavokTest extends LigaStavokTestBase {
    @Tag("remote")
    @Test
    void smokePaymentsTest() {

        SelenideLogger.addListener("allure", new AllureSelenide());
        step("Открываем главную страницу", () -> open(baseUrl));
        step("Кликаем по кнопке Вход", () -> {
            $("div.wrapper_y30x.none_ZwlT")
                    .shouldBe(Condition.visible)
                    .click();
        });


        sleep(5000);
    }
}