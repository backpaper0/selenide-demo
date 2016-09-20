package demo.page.widget;

import static com.codeborne.selenide.Condition.*;

import org.openqa.selenium.support.ui.Select;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;

public class ElementWrapper extends ElementsContainer {

    public ElementWrapper() {
    }

    public ElementWrapper(SelenideElement self) {
        setSelf(self);
    }

    public void をクリックする() {
        getSelf().click();
    }

    public Operation へ(String text) {
        return new Operation(text);
    }

    public Operation で(String text) {
        return new Operation(text);
    }

    public Operation は(String text) {
        return new Operation(text);
    }

    public class Operation {

        private final String text;

        public Operation(String text) {
            this.text = text;
        }

        public void をセットする() {
            getSelf().val(text);
        }

        public void を選択する() {
            new Select(getSelf()).selectByVisibleText(text);
        }

        public void と表示されている() {
            getSelf().shouldBe(text(text));
        }
    }
}
