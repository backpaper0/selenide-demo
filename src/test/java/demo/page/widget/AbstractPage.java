package demo.page.widget;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.SelenideElement;

public abstract class AbstractPage {

    @FindBy(css = ".projects")
    public SelenideElement プロジェクトメニュー;
    @FindBy(css = ".administration")
    public SelenideElement 管理メニュー;
    @FindBy(css = ".login")
    public SelenideElement ログインメニュー;

    @FindBy(css = ".logout")
    public SelenideElement ログアウト;
}
