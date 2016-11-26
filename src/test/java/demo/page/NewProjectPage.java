package demo.page;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.SelenideElement;

import demo.page.widget.AbstractPage;

public class NewProjectPage extends AbstractPage {

    @FindBy(name = "project[name]")
    public SelenideElement 名称;
    @FindBy(name = "project[identifier]")
    public SelenideElement 識別子;

    @FindBy(name = "commit")
    public SelenideElement 作成;
    @FindBy(name = "continue")
    public SelenideElement 連続作成;
}
