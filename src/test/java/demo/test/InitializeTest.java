package demo.test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

import org.junit.Test;
import org.openqa.selenium.support.ui.Select;

import demo.page.AccountPage;
import demo.page.AdminPage;
import demo.page.HomePage;
import demo.page.LoginPage;
import demo.page.NewProjectPage;
import demo.page.NewUserPage;
import demo.page.PasswordPage;
import demo.page.ProjectsPage;
import demo.page.UsersPage;

public class InitializeTest {

    @Test
    public void initialize() throws Exception {
        HomePage home = open("/", HomePage.class);
        home.ログインメニュー.click();

        LoginPage login = page(LoginPage.class);
        login.ログインID.val("admin");
        login.パスワード.val("admin");
        login.ログイン.click();

        PasswordPage password = page(PasswordPage.class);
        password.パスワード.val("admin");
        password.新しいパスワード.val("secret1234");
        password.パスワードの確認.val("secret1234");
        password.適用.click();

        AccountPage account = page(AccountPage.class);
        account.管理メニュー.click();

        AdminPage admin = page(AdminPage.class);
        admin.デフォルト設定をロード.click();
        admin.ユーザー.click();

        UsersPage users = page(UsersPage.class);
        users.新しいユーザー.click();

        NewUserPage newUser = page(NewUserPage.class);
        newUser.ログインID.val("foo");
        newUser.名.val("ゆーざー");
        newUser.姓.val("てすと");
        newUser.メールアドレス.val("foo@example.com");
        new Select(newUser.言語).selectByVisibleText("Japanese (日本語)");
        newUser.パスワード.val("secret5678");
        newUser.パスワードの確認.val("secret5678");
        newUser.作成.click();
        newUser.プロジェクトメニュー.click();

        ProjectsPage projects = page(ProjectsPage.class);
        projects.新しいプロジェクト.click();

        NewProjectPage newProject = page(NewProjectPage.class);
        newProject.名称.val("デモプロジェクト");
        newProject.識別子.val("demo");
        newProject.作成.click();

        newProject.ログアウト.click();
    }
}
