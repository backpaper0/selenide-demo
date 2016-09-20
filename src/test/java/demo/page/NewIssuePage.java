package demo.page;

import org.openqa.selenium.support.FindBy;

import demo.page.widget.AbstractProjectPage;
import demo.page.widget.ElementWrapper;

public class NewIssuePage extends AbstractProjectPage {

    @FindBy(name = "issue[tracker_id]")
    public ElementWrapper トラッカー;
    @FindBy(name = "issue[subject]")
    public ElementWrapper 題名;
    @FindBy(name = "issue[description]")
    public ElementWrapper 説明;
    @FindBy(name = "issue[status_id]")
    public ElementWrapper ステータス;
    @FindBy(name = "issue[priority_id]")
    public ElementWrapper 優先度;
    @FindBy(name = "issue[assigned_to_id]")
    public ElementWrapper 担当者;
    @FindBy(name = "issue[start_date]")
    public ElementWrapper 開始日;
    @FindBy(name = "issue[due_date]")
    public ElementWrapper 期日;
    @FindBy(name = "issue[estimated_hours]")
    public ElementWrapper 予定工数;
    @FindBy(name = "issue[done_ratio]")
    public ElementWrapper 進捗率;
    @FindBy(name = "attachments[dummy][file]")
    public ElementWrapper ファイル;
    @FindBy(name = "commit")
    public ElementWrapper 作成;
    @FindBy(name = "continue")
    public ElementWrapper 連続作成;
}
