package demo.page;

import org.openqa.selenium.support.FindBy;

import demo.page.widget.AbstractPage;
import demo.page.widget.ElementWrapper;

public class LoginPage extends AbstractPage {

    @FindBy(name = "username")
    public ElementWrapper ログインID;
    @FindBy(name = "password")
    public ElementWrapper パスワード;
    @FindBy(name = "login")
    public ElementWrapper ログイン;
}
