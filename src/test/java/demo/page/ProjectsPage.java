package demo.page;

import org.openqa.selenium.support.FindBy;

import demo.page.widget.AbstractPage;
import demo.page.widget.ElementWrapper;

public class ProjectsPage extends AbstractPage {

    @FindBy(linkText = "新しいプロジェクト")
    public ElementWrapper 新しいプロジェクト;
}
