package ru.netology.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;
import ru.netology.data.SQLHelper;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {

    private static final SelenideElement codeField = $("[data-test-id='code'] input");
    private static final SelenideElement continueButton = $("[data-test-id='action-verify'].button");
    private static final SelenideElement header = $(".paragraph");

    public VerificationPage() {
        header.shouldBe(Condition.visible);
    }

    public DashboardPage validVerify(DataHelper.AuthInfo authInfo) {
        String login = authInfo.getLogin();
        codeField.setValue(SQLHelper.getVerificationCode(login));
        continueButton.click();
        return new DashboardPage();
    }
}
