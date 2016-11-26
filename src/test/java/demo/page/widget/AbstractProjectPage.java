package demo.page.widget;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.SelenideElement;

public abstract class AbstractProjectPage extends AbstractPage {

    @FindBy(css = "a.issues")
    public SelenideElement チケットメニュー;
}
