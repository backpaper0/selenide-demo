package demo.page;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.SelenideElement;

import demo.page.widget.AbstractPage;

public class UsersPage extends AbstractPage {

    @FindBy(linkText = "新しいユーザー")
    public SelenideElement 新しいユーザー;
}
