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

    public Confirm 確認ダイアログに(String text) {
        confirm(text);
        return Confirm.INSTANCE;
    }

    public void 確認ダイアログでキャンセルを選ぶ() {
        switchTo().alert().dismiss();
        switchTo().defaultContent();
    }

    public enum Screenshot {
        INSTANCE;
        public void という名前で保存する() {
        }
    }

    public enum Confirm {
        INSTANCE;
        public void と表示されている() {
        }
    }
}
