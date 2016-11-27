package demo.test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import demo.page.HomePage;
import demo.page.IssuePage;
import demo.page.IssuesPage;
import demo.page.LoginPage;
import demo.page.NewIssuePage;
import demo.page.ProjectPage;
import demo.page.ProjectsPage;

public class IssueTest {

    @Test
    public void createNewIssue() throws Exception {
        HomePage home = open("/", HomePage.class);
        home.ログインメニュー.click();

        LoginPage login = page(LoginPage.class);
        login.ログインID.val("backpaper0");
        login.パスワード.val("secret5678");
        login.ログイン.click();

        home = page(HomePage.class);
        home.プロジェクトメニュー.click();

        ProjectsPage projects = page(ProjectsPage.class);
        projects.プロジェクト一覧から("デモプロジェクト").click();

        ProjectPage project = page(ProjectPage.class);
        project.チケットメニュー.click();

        IssuesPage issues = page(IssuesPage.class);
        issues.チケット数は(0);
        Selenide.screenshot("1.チケット登録前の状態");
        issues.新しいチケット.click();

        NewIssuePage newIssue = page(NewIssuePage.class);
        new Select(newIssue.トラッカー).selectByVisibleText("機能");
        newIssue.題名.val("ブラウザ自動テストのデモを行う");
        newIssue.説明.val("Redmineを題材にしてSelenideのデモを行う。");
        new Select(newIssue.担当者).selectByVisibleText("うらがみ たいち");
        //workaround for chrome
        //newIssue.開始日.sendKeys("0020160927");
        //newIssue.期日.sendKeys("0020160927");
        newIssue.予定工数.val("0.5");
        Selenide.screenshot("2.新規チケットの入力値");
        newIssue.作成.click();

        IssuePage issue = page(IssuePage.class);
        issue.チケットメニュー.click();

        issues = page(IssuesPage.class);
        issues.チケット数は(1);
        Selenide.screenshot("3.チケット登録後の状態");
        issues.チケット一覧から("ブラウザ自動テストのデモを行う").click();

        issue = page(IssuePage.class);
        issue.題名.shouldBe(Condition.text("ブラウザ自動テストのデモを行う"));
        Selenide.screenshot("4.チケットを開いた状態");
    }
}
