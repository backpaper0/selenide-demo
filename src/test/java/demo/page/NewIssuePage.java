package demo.page;

import org.openqa.selenium.support.FindBy;

import com.codeborne.selenide.SelenideElement;

import demo.page.widget.AbstractProjectPage;

public class NewIssuePage extends AbstractProjectPage {

    @FindBy(name = "issue[tracker_id]")
    public SelenideElement トラッカー;
    @FindBy(name = "issue[subject]")
    public SelenideElement 題名;
    @FindBy(name = "issue[description]")
    public SelenideElement 説明;
    @FindBy(name = "issue[status_id]")
    public SelenideElement ステータス;
    @FindBy(name = "issue[priority_id]")
    public SelenideElement 優先度;
    @FindBy(name = "issue[assigned_to_id]")
    public SelenideElement 担当者;
    @FindBy(name = "issue[start_date]")
    public SelenideElement 開始日;
    @FindBy(name = "issue[due_date]")
    public SelenideElement 期日;
    @FindBy(name = "issue[estimated_hours]")
    public SelenideElement 予定工数;
    @FindBy(name = "issue[done_ratio]")
    public SelenideElement 進捗率;
    @FindBy(name = "attachments[dummy][file]")
    public SelenideElement ファイル;
    @FindBy(name = "commit")
    public SelenideElement 作成;
    @FindBy(name = "continue")
    public SelenideElement 連続作成;
}
