package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class MainPageTests extends TestBase {
    @Test
    @DisplayName("Vacancy form should appear after click the button")
    void vacancyTest() {
        step("Open url 'https://companyclick.ru'", () ->
                open("https://companyclick.ru/#tabs_desc_415_6"));

        step("Click on button Vacancy", () ->
                $("#menu-item-585").click());

        step("Block Vacancy should be visible", () ->
                $(".blog-postsrow").shouldBe(visible));
    }

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://companyclick.ru'", () ->
                open("https://companyclick.ru/#tabs_desc_415_6"));

        step("Page title should have text 'CLICK - affiliate services'", () -> {
            String expectedTitle = "CLICK - affiliate services";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://companyclick.ru'", () ->
                open("https://companyclick.ru/#tabs_desc_415_6"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

    @Test
    @DisplayName("Block Work Flow should not have text 'Cloud Databases'")
    void javaWorkFlowTest() {
        step("Open url 'https://companyclick.ru'", () ->
                open("https://companyclick.ru/#tabs_desc_415_6"));

        step("Click on button work flows", () ->
                $("#menu-item-61").click());

        step("Block Work Flow should not have text 'Cloud Databases'", () ->
                $(".gridContainer").shouldNotHave(text("Cloud Databases")));
    }
}