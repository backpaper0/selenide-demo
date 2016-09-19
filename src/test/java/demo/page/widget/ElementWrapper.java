package demo.page.widget;

import org.openqa.selenium.support.ui.Select;

import com.codeborne.selenide.ElementsContainer;

public class ElementWrapper extends ElementsContainer {

    public void をクリックする() {
        getSelf().click();
    }

    public SetterSuffix へ(String text) {
        return new SetterSuffix(text);
    }

    public SetterSuffix で(String text) {
        return new SetterSuffix(text);
    }

    public class SetterSuffix {

        private final String text;

        public SetterSuffix(String text) {
            this.text = text;
        }

        public void をセットする() {
            getSelf().val(text);
        }

        public void を選択する() {
            new Select(getSelf()).selectByVisibleText(text);
        }
    }
}
