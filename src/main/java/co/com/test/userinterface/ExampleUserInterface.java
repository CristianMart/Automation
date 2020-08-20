package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static co.com.test.util.Constantes.URL;

@DefaultUrl(URL)

public class ExampleUserInterface extends PageObject {
    public static final Target Example1 = Target.the("Tarifario")
            .located(By.xpath("//*[@id=\"footer-content\"]/div[2]/div[1]/div/div[2]/div/ul/li[5]/a"));
    public static final Target Example2 = Target.the("Tarifario")
            .located(By.xpath("//*[@id=\"footer-content\"]/div[2]/div[1]/div/div[2]/div/ul/li[5]/a"));
    public static final Target Example3 = Target.the("Tarifario")
            .located(By.xpath("//*[@id=\"footer-content\"]/div[2]/div[1]/div/div[2]/div/ul/li[5]/a"));
    public static final Target Example4 = Target.the("Tarifario")
            .located(By.xpath("//*[@id=\"footer-content\"]/div[2]/div[1]/div/div[2]/div/ul/li[5]/a"));

}
