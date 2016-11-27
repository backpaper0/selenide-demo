package demo.page;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import demo.page.widget.AbstractProjectPage;

public class IssuePage extends AbstractProjectPage {

    @FindBy(css = "div.subject h3")
    public SelenideElement 題名;
    @FindBy(linkText = "編集")
    public SelenideElement 編集;
    @FindBy(linkText = "削除")
    public SelenideElement 削除;
    @FindBy(name = "attachments[dummy][file]")
    public SelenideElement ファイル;
    @FindBy(name = "commit")
    public SelenideElement 送信;

    @FindBy(css = ".attachments a.icon-attachment")
    public ElementsCollection 添付ファイル一覧;
    @FindBy(name = "attachments[1][description]")
    public SelenideElement 説明;
}
