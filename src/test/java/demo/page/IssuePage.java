package demo.page;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.ElementsCollection;

import demo.page.widget.AbstractProjectPage;
import demo.page.widget.ElementWrapper;

public class IssuePage extends AbstractProjectPage {

    @FindBy(css = "div.subject h3")
    public ElementWrapper 題名;
    @FindBy(linkText = "編集")
    public ElementWrapper 編集;
    @FindBy(name = "attachments[dummy][file]")
    public ElementWrapper ファイル;
    @FindBy(name = "commit")
    public ElementWrapper 送信;

    @FindBy(css = ".attachments a.icon-attachment")
    private ElementsCollection 添付ファイル一覧;

    public void 添付ファイル数は(int size) {
        添付ファイル一覧.shouldHaveSize(size);
    }
}
