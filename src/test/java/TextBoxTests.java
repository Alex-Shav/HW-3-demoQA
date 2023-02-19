import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest() {
        open("/automation-practice-form");

        $("#firstName").setValue("Alex");
        $("#lastName").setValue("Shav");
        $("#userEmail").setValue("AlexShav@mmmail.com");
        $("#gender-radio-1").sendKeys(" ");
        $("#userNumber").setValue("+375291112233");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-dropdown-container").$(byText("December")).click();
        $(".react-datepicker__year-dropdown-container").$(byText("1986")).click();
        $(".react-datepicker__month-container").$(byText("24")).click();
        $("#subjectsInput").setValue("History").pressEnter();




    }
}