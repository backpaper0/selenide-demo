package demo.page.widget;

import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.support.FindBy;

public abstract class AbstractPage {

    @FindBy(css = ".projects")
    public ElementWrapper プロジェクトメニュー;
    @FindBy(css = ".administration")
    public ElementWrapper 管理メニュー;
    @FindBy(css = ".login")
    public ElementWrapper ログインメニュー;

    @FindBy(css = ".logout")
    public ElementWrapper ログアウト;

    public void スクリーンショット(String fileName) {
        screenshot(fileName);
    }
}
