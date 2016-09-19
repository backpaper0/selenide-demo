package demo.page;

import org.openqa.selenium.support.FindBy;

import demo.page.widget.AbstractPage;
import demo.page.widget.ElementWrapper;

public class AdminPage extends AbstractPage {

    @FindBy(name = "commit")
    public ElementWrapper デフォルト設定をロード;

    @FindBy(css = ".users")
    public ElementWrapper ユーザー;
}
