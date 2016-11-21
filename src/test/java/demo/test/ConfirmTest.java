package demo.test;

import static com.codeborne.selenide.Selenide.*;

import org.junit.Test;

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
        home.ログインメニュー.をクリックする();

        LoginPage login = page(LoginPage.class);
        login.ログインID.へ("admin").をセットする();
        login.パスワード.へ("secret1234").をセットする();
        login.ログイン.をクリックする();

        home = page(HomePage.class);
        home.プロジェクトメニュー.をクリックする();

        ProjectsPage projects = page(ProjectsPage.class);
        projects.プロジェクト一覧から("デモプロジェクト").をクリックする();

        ProjectPage project = page(ProjectPage.class);
        project.チケットメニュー.をクリックする();

        IssuesPage issues = page(IssuesPage.class);
        issues.チケット数は(1);
        issues.チケット一覧から("ブラウザ自動テストのデモを行う").をクリックする();

        IssuePage issue = page(IssuePage.class);
        issue = page(IssuePage.class);
        issue.削除.をクリックする();
        issue.確認ダイアログに("本当に選択したチケットを削除しますか？").と表示されている();
        issue.チケットメニュー.をクリックする();

        issues = page(IssuesPage.class);
        issues.チケット数は(0);
    }

    @Test
    public void notDelete() throws Exception {
        HomePage home = open("/", HomePage.class);
        home.ログインメニュー.をクリックする();

        LoginPage login = page(LoginPage.class);
        login.ログインID.へ("admin").をセットする();
        login.パスワード.へ("secret1234").をセットする();
        login.ログイン.をクリックする();

        home = page(HomePage.class);
        home.プロジェクトメニュー.をクリックする();

        ProjectsPage projects = page(ProjectsPage.class);
        projects.プロジェクト一覧から("デモプロジェクト").をクリックする();

        ProjectPage project = page(ProjectPage.class);
        project.チケットメニュー.をクリックする();

        IssuesPage issues = page(IssuesPage.class);
        issues.チケット数は(1);
        issues.チケット一覧から("ブラウザ自動テストのデモを行う").をクリックする();

        IssuePage issue = page(IssuePage.class);
        issue = page(IssuePage.class);
        issue.削除.をクリックする();
        issue.確認ダイアログでキャンセルを選ぶ();
        issue.チケットメニュー.をクリックする();

        issues = page(IssuesPage.class);
        issues.チケット数は(1);
    }
}
