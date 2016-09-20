package demo.page;

import org.openqa.selenium.support.FindBy;

import demo.page.widget.AbstractProjectPage;
import demo.page.widget.ElementWrapper;

public class IssuePage extends AbstractProjectPage {

    @FindBy(css = "div.subject h3")
    public ElementWrapper 題名;
}
