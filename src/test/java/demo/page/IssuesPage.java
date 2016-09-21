package demo.page;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.support.FindBy;

import demo.page.widget.AbstractProjectPage;
import demo.page.widget.ElementWrapper;

public class IssuesPage extends AbstractProjectPage {

    @FindBy(css = "a.new-issue")
    public ElementWrapper 新しいチケット;

    public void チケット数は(int size) {
        $$("tr.issue").shouldBe(size(size));
    }

    public ElementWrapper チケット一覧から(String text) {
        return new ElementWrapper($(byLinkText(text)));
    }
}
