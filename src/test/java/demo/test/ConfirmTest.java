package demo.test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import org.junit.Test;

import com.codeborne.selenide.Selenide;

import demo.page.HomePage;
import demo.page.IssuePage;
import demo.page.IssuesPage;
import demo.page.LoginPage;
import demo.page.ProjectPage;
import demo.page.ProjectsPage;

public class ConfirmTest {

    @Test
    public void delete() throws Exception {
        HomePage home = open("/", HomePage.class);
        home.ログインメニュー.click();

        LoginPage login = page(LoginPage.class);
        login.ログインID.val("admin");
        login.パスワード.val("secret1234");
        login.ログイン.click();

        home = page(HomePage.class);
        home.プロジェクトメニュー.click();

        ProjectsPage projects = page(ProjectsPage.class);
        projects.プロジェクト一覧から("デモプロジェクト").click();

        ProjectPage project = page(ProjectPage.class);
        project.チケットメニュー.click();

        IssuesPage issues = page(IssuesPage.class);
        issues.チケット数は(1);
        issues.チケット一覧から("ブラウザ自動テストのデモを行う").click();

        IssuePage issue = page(IssuePage.class);
        issue = page(IssuePage.class);
        issue.削除.click();
        Selenide.confirm("本当に選択したチケットを削除しますか？");
        issue.チケットメニュー.click();

        issues = page(IssuesPage.class);
        issues.チケット数は(0);
    }

    @Test
    public void notDelete() throws Exception {
        HomePage home = open("/", HomePage.class);
        home.ログインメニュー.click();

        LoginPage login = page(LoginPage.class);
        login.ログインID.val("admin");
        login.パスワード.val("secret1234");
        login.ログイン.click();

        home = page(HomePage.class);
        home.プロジェクトメニュー.click();

        ProjectsPage projects = page(ProjectsPage.class);
        projects.プロジェクト一覧から("デモプロジェクト").click();

        ProjectPage project = page(ProjectPage.class);
        project.チケットメニュー.click();

        IssuesPage issues = page(IssuesPage.class);
        issues.チケット数は(1);
        issues.チケット一覧から("ブラウザ自動テストのデモを行う").click();

        IssuePage issue = page(IssuePage.class);
        issue = page(IssuePage.class);
        issue.削除.click();
        //確認ダイアログでキャンセルを選ぶ
        Selenide.switchTo().alert().dismiss();
        Selenide.switchTo().defaultContent();
        issue.チケットメニュー.click();

        issues = page(IssuesPage.class);
        issues.チケット数は(1);
    }
}
