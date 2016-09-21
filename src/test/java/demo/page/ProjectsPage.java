package demo.page;

import static com.codeborne.selenide.Condition.*;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.ElementsCollection;

import demo.page.widget.AbstractPage;
import demo.page.widget.ElementWrapper;

public class ProjectsPage extends AbstractPage {

    @FindBy(linkText = "新しいプロジェクト")
    public ElementWrapper 新しいプロジェクト;

    @FindBy(css = ".project")
    private ElementsCollection プロジェクト一覧;

    public ElementWrapper プロジェクト一覧から(String text) {
        return new ElementWrapper(プロジェクト一覧.findBy(text(text)));
    }
}
