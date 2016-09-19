package demo.page;

import org.openqa.selenium.support.FindBy;

import demo.page.widget.AbstractPage;
import demo.page.widget.ElementWrapper;

public class PasswordPage extends AbstractPage {

    @FindBy(name = "password")
    public ElementWrapper パスワード;
    @FindBy(name = "new_password")
    public ElementWrapper 新しいパスワード;
    @FindBy(name = "new_password_confirmation")
    public ElementWrapper パスワードの確認;
    @FindBy(name = "commit")
    public ElementWrapper 適用;
}
