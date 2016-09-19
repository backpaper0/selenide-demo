package demo.page;

import org.openqa.selenium.support.FindBy;

import demo.page.widget.AbstractPage;
import demo.page.widget.ElementWrapper;

public class UsersPage extends AbstractPage {

    @FindBy(linkText = "新しいユーザー")
    public ElementWrapper 新しいユーザー;
}
