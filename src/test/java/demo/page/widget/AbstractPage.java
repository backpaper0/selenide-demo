package demo.page.widget;

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
}
