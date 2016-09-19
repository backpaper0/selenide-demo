package demo.page;

import org.openqa.selenium.support.FindBy;

import demo.page.widget.AbstractPage;
import demo.page.widget.ElementWrapper;

public class NewProjectPage extends AbstractPage {

    @FindBy(name = "project[name]")
    public ElementWrapper 名称;
    @FindBy(name = "project[identifier]")
    public ElementWrapper 識別子;

    @FindBy(name = "commit")
    public ElementWrapper 作成;
    @FindBy(name = "continue")
    public ElementWrapper 連続作成;
}
