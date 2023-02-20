import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1366x768";
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
        $("#dateOfBirthInput").setValue("24 Dec 1986").pressEnter();
        $("#subjectsInput").setValue("History").pressEnter();
        $("#hobbies-checkbox-1").sendKeys(" ");
        $("#uploadPicture").uploadFile(new File("src/test/resources/Pic.png"));
        $("#currentAddress").setValue("Minsk");
        $("#state").click();
        $("#react-select-3-input").pressEnter();
        $("#city").click();
        $("#react-select-4-input").pressEnter();
        $("#submit").pressEnter();


    }
}