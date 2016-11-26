package demo.page;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.SelenideElement;

import demo.page.widget.AbstractProjectPage;

public class IssuesPage extends AbstractProjectPage {

    @FindBy(css = "a.new-issue")
    public SelenideElement 新しいチケット;

    public void チケット数は(int size) {
        $$("tr.issue").shouldHaveSize(size);
    }

    public SelenideElement チケット一覧から(String text) {
        return $(byLinkText(text));
    }
}
