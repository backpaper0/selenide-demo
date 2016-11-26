package demo.page;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.SelenideElement;

import demo.page.widget.AbstractPage;

public class LoginPage extends AbstractPage {

    @FindBy(name = "username")
    public SelenideElement ログインID;
    @FindBy(name = "password")
    public SelenideElement パスワード;
    @FindBy(name = "login")
    public SelenideElement ログイン;
}
