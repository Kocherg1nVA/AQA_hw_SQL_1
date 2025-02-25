package ru.netology.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {

    private static final SelenideElement codeField = $("[data-test-id='code'] input");
    private static final SelenideElement continueButton = $("[data-test-id='action-verify'].button");
    private static final SelenideElement header = $(".paragraph");

    public VerificationPage() {
        header.shouldBe(Condition.visible);
    }

    public DashboardPage validVerify(String verificationCode) {
        codeField.setValue(verificationCode);
        continueButton.click();
        return new DashboardPage();
    }
}
