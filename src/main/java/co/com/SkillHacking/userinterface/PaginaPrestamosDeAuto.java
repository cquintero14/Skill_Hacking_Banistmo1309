package co.com.SkillHacking.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrestamosDeAuto {
    public static Target PRESTAMOS_AUTO_REGULAR = Target.the("Botón para acceder a la pagina Prestamos de Autosmóviles Regulares").located(By.xpath("(//*[contains(@title,'Cuentas de Ahorro')])[1]"));
    public static Target TITULO_PRESTAMOS = Target.the("Objeto para hacer scroll y cuadrar la pantalla").located(By.xpath("(//*[contains(@class,'titulo')])"));


}
