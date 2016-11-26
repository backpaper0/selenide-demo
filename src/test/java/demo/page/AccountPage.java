package demo.page;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.SelenideElement;

import demo.page.widget.AbstractPage;

public class AccountPage extends AbstractPage {
    @FindBy(name = "user[language]")
    public SelenideElement 言語;
    @FindBy(name = "pref[time_zone]")
    public SelenideElement タイムゾーン;
    @FindBy(name = "commit")
    public SelenideElement 保存;
}
