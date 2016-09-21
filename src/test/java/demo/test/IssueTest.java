package demo.test;

import static com.codeborne.selenide.Selenide.*;

import org.junit.Test;

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
        home.ログインメニュー.をクリックする();

        LoginPage login = page(LoginPage.class);
        login.ログインID.へ("foo").をセットする();
        login.パスワード.へ("secret5678").をセットする();
        login.ログイン.をクリックする();

        home = page(HomePage.class);
        home.プロジェクトメニュー.をクリックする();

        ProjectsPage projects = page(ProjectsPage.class);
        projects.プロジェクト("デモプロジェクト").をクリックする();

        ProjectPage project = page(ProjectPage.class);
        project.チケットメニュー.をクリックする();

        IssuesPage issues = page(IssuesPage.class);
        issues.チケット数は(0);
        issues.スクリーンショット("1.チケット登録前の状態");
        issues.新しいチケット.をクリックする();

        NewIssuePage newIssue = page(NewIssuePage.class);
        newIssue.トラッカー.で("機能").を選択する();
        newIssue.題名.へ("ブラウザ自動テストのデモを行う").をセットする();
        newIssue.説明.へ("Redmineを題材にしてSelenideのデモを行う。").をセットする();
        newIssue.担当者.で("ゆーざー てすと").を選択する();
        newIssue.開始日.へ("2016-09-27").をセットする();
        newIssue.期日.へ("2016-09-27").をセットする();
        newIssue.予定工数.へ("0.5").をセットする();
        newIssue.スクリーンショット("2.新規チケットの入力値");
        newIssue.作成.をクリックする();

        IssuePage issue = page(IssuePage.class);
        issue.チケットメニュー.をクリックする();

        issues = page(IssuesPage.class);
        issues.チケット数は(1);
        issues.スクリーンショット("3.チケット登録後の状態");
        issues.チケット("ブラウザ自動テストのデモを行う").をクリックする();

        issue = page(IssuePage.class);
        issue.題名.は("ブラウザ自動テストのデモを行う").と表示されている();
        issue.スクリーンショット("4.チケットを開いた状態");
    }
}
