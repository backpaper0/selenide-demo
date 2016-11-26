package demo.page;

import static com.codeborne.selenide.Condition.text;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import demo.page.widget.AbstractPage;

public class ProjectsPage extends AbstractPage {

    @FindBy(linkText = "新しいプロジェクト")
    public SelenideElement 新しいプロジェクト;

    @FindBy(css = ".project")
    private ElementsCollection プロジェクト一覧;

    public SelenideElement プロジェクト一覧から(String text) {
        return プロジェクト一覧.findBy(text(text));
    }
}
