package demo.page;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.SelenideElement;

import demo.page.widget.AbstractPage;

public class AdminPage extends AbstractPage {

    @FindBy(name = "commit")
    public SelenideElement デフォルト設定をロード;

    @FindBy(css = ".users")
    public SelenideElement ユーザー;
}
