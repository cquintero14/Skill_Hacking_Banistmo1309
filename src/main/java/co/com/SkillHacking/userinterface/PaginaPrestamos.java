package co.com.SkillHacking.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class PaginaPrestamos {
    public static Target ESPACIO_BLANCO = Target.the("Espacio que uso para hacer scroll y cuadrar la pantalla").located(By.xpath("(//*[contains(@class,'col-xs-12')])[1]"));
    public static Target PRESTAMOS_AUTO = Target.the("Prestamos de Auto").located(By.xpath("(//*[contains(@title,'Préstamos de Auto')])[1]"));

}