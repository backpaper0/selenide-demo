package demo.page;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.SelenideElement;

import demo.page.widget.AbstractPage;

public class PasswordPage extends AbstractPage {

    @FindBy(name = "password")
    public SelenideElement パスワード;
    @FindBy(name = "new_password")
    public SelenideElement 新しいパスワード;
    @FindBy(name = "new_password_confirmation")
    public SelenideElement パスワードの確認;
    @FindBy(name = "commit")
    public SelenideElement 適用;
}
