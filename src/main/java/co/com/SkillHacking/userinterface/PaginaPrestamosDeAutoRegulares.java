package co.com.SkillHacking.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrestamosDeAutoRegulares {
    public static Target PDF_PROHIBICIONES = Target.the("PDF Prohibiciones").located(By.xpath("(//*[contains(@title,'Guía para afiliación a compra')])[2]"));
    public static Target PESTAÑA_TASAS = Target.the("Pestaña Tasas y Tarifas").located(By.xpath("//a[@href='#tab4']"));
    public static Target PESTAÑA_BENEFICIOS = Target.the("Pestaña Beneficios").located(By.xpath("//a[@href='#tab1']"));

}
