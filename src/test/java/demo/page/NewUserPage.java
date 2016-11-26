package demo.page;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.SelenideElement;

import demo.page.widget.AbstractPage;

public class NewUserPage extends AbstractPage {

    @FindBy(name = "user[login]")
    public SelenideElement ログインID;
    @FindBy(name = "user[firstname]")
    public SelenideElement 名;
    @FindBy(name = "user[lastname]")
    public SelenideElement 姓;
    @FindBy(name = "user[mail]")
    public SelenideElement メールアドレス;
    @FindBy(name = "user[language]")
    public SelenideElement 言語;
    @FindBy(name = "pref[time_zone]")
    public SelenideElement タイムゾーン;

    @FindBy(name = "user[password]")
    public SelenideElement パスワード;
    @FindBy(name = "user[password_confirmation]")
    public SelenideElement パスワードの確認;

    @FindBy(name = "commit")
    public SelenideElement 作成;
    @FindBy(name = "continue")
    public SelenideElement 連続作成;
}
