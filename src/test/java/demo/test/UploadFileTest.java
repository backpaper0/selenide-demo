package demo.test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import java.nio.file.Paths;

import org.junit.Test;

import com.codeborne.selenide.Selenide;

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
        issues.チケット数は(1);
        issues.チケット一覧から("ブラウザ自動テストのデモを行う").click();

        IssuePage issue = page(IssuePage.class);
        issue = page(IssuePage.class);
        issue.添付ファイル数は(0);
        Selenide.screenshot("5.ファイルを添付する前");
        issue.編集.click();

        issue.ファイル.uploadFile(Paths.get("README.md").toFile());
        issue.送信.click();
        issue.添付ファイル数は(1);
        Selenide.screenshot("6.ファイルを添付した後");
    }
}
