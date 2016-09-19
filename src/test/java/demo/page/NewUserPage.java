package demo.page;

import org.openqa.selenium.support.FindBy;

import demo.page.widget.AbstractPage;
import demo.page.widget.ElementWrapper;

public class NewUserPage extends AbstractPage {

    @FindBy(name = "user[login]")
    public ElementWrapper ログインID;
    @FindBy(name = "user[firstname]")
    public ElementWrapper 名;
    @FindBy(name = "user[lastname]")
    public ElementWrapper 姓;
    @FindBy(name = "user[mail]")
    public ElementWrapper メールアドレス;
    @FindBy(name = "user[language]")
    public ElementWrapper 言語;

    @FindBy(name = "user[password]")
    public ElementWrapper パスワード;
    @FindBy(name = "user[password_confirmation]")
    public ElementWrapper パスワードの確認;

    @FindBy(name = "commit")
    public ElementWrapper 作成;
    @FindBy(name = "continue")
    public ElementWrapper 連続作成;
}
