package demo.test;

import static com.codeborne.selenide.Selenide.*;

import org.junit.Test;

import demo.page.HomePage;
import demo.page.IssuePage;
import demo.page.IssuesPage;
import demo.page.LoginPage;
import demo.page.ProjectPage;
import demo.page.ProjectsPage;

public class UploadFileTest {

    @Test
    public void uploadFile() throws Exception {
        HomePage home = open("/", HomePage.class);
        home.ログインメニュー.をクリックする();

        LoginPage login = page(LoginPage.class);
        login.ログインID.へ("foo").をセットする();
        login.パスワード.へ("secret5678").をセットする();
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
        issue.添付ファイル数は(0);
        issue.スクリーンショットを撮って("5.ファイルを添付する前").という名前で保存する();
        issue.編集.をクリックする();

        issue.ファイル.へ("README.md").を添付する();
        issue.送信.をクリックする();
        issue.添付ファイル数は(1);
        issue.スクリーンショットを撮って("6.ファイルを添付した後").という名前で保存する();
    }
}
