import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class VacancyTest {

    private static final WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

    @Test
    @DisplayName("Открытие страницы поиска вакансий")
    void openItOneVacancyPageTest(){

        step("Открываем страницу поиска вакансий", () -> {
            open(webConfig.baseUrl() + "/vacancies/");
        });
        step("Проверяем, что страница открыта успешно", () -> {
            $(".big-heading.big-heading_2.small-intro__heading").shouldHave(text("Вакансии"));
        });
    }
}
