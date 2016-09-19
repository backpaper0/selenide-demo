package demo.test;

import static com.codeborne.selenide.Selenide.*;

import org.junit.Test;

import com.codeborne.selenide.Selenide;

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
        HomePage home = Selenide.open("/", HomePage.class);
        home.ログインメニュー.をクリックする();

        LoginPage login = page(LoginPage.class);
        login.ログインID.へ("admin").をセットする();
        login.パスワード.へ("admin").をセットする();
        login.ログイン.をクリックする();

        PasswordPage password = page(PasswordPage.class);
        password.パスワード.へ("admin").をセットする();
        password.新しいパスワード.へ("secret1234").をセットする();
        password.パスワードの確認.へ("secret1234").をセットする();
        password.適用.をクリックする();

        AccountPage account = page(AccountPage.class);
        account.管理メニュー.をクリックする();

        AdminPage admin = page(AdminPage.class);
        admin.デフォルト設定をロード.をクリックする();
        admin.ユーザー.をクリックする();

        UsersPage users = page(UsersPage.class);
        users.新しいユーザー.をクリックする();

        NewUserPage newUser = page(NewUserPage.class);
        newUser.ログインID.へ("backpaper0").をセットする();
        newUser.名.へ("ほにゃほにゃ").をセットする();
        newUser.姓.へ("うらがみ").をセットする();
        newUser.メールアドレス.へ("backpaper0@gmail.com").をセットする();
        newUser.言語.で("Japanese (日本語)").を選択する();
        newUser.パスワード.へ("secret5678").をセットする();
        newUser.パスワードの確認.へ("secret5678").をセットする();
        newUser.作成.をクリックする();
        newUser.プロジェクトメニュー.をクリックする();

        ProjectsPage projects = page(ProjectsPage.class);
        projects.新しいプロジェクト.をクリックする();

        NewProjectPage newProject = page(NewProjectPage.class);
        newProject.名称.へ("デモプロジェクト").をセットする();
        newProject.識別子.へ("demo").をセットする();
        newProject.作成.をクリックする();

        newProject.ログアウト.をクリックする();
    }
}
