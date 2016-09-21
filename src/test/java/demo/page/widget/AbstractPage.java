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

    public Screenshot スクリーンショットを撮って(String fileName) {
        screenshot(fileName);
        return Screenshot.INSTANCE;
    }

    public enum Screenshot {
        INSTANCE;
        public void という名前で保存する() {
        }
    }
}
