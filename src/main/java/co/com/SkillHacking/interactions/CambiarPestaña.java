package co.com.SkillHacking.interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class CambiarPestaña extends PageObject implements Interaction{

    public static CambiarPestaña andWait() {
        return new CambiarPestaña();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = Serenity.getDriver();
        String originalWindow = driver.getWindowHandle();


        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

    }
}
