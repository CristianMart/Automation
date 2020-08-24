package co.com.test.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.ArrayList;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class ChangeWindowWeb implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        ArrayList<String> newTab = new ArrayList<String>
                (getDriver().getWindowHandles());
        //getDriver().switchTo().window(newTab.get(Constat.ONE));
    }

    /*public static ChangeWindoWeb desider(){
        return new ChangeWindoWeb();
    }*/


}
