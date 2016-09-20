package demo.page.widget;

import org.openqa.selenium.support.FindBy;

public abstract class AbstractProjectPage extends AbstractPage {

    @FindBy(css = "a.issues")
    public ElementWrapper チケットメニュー;
}
