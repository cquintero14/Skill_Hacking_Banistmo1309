package co.com.SkillHacking.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

@DefaultUrl(" https://www.banistmo.com/wps/portal/banistmo/personas/")
public class PaginaBanistmo extends PageObject{
    public static Target SECCION_PRODUCTOS = Target.the("Productos & Servicios").located(By.xpath("//*[contains(@class,'dropdown-toggle')]"));
    public static Target OPCION_PRESTAMOS = Target.the("Opción Prestamos").located(By.xpath("//a[@href='/wps/portal/banistmo/personas/productos-y-servicios/prestamos']"));
    public static Target BOTON_COOKIES  = Target.the("Botón emergente al iniciar para aceptar cookies").located(By.id("btn-aceptar-cookies"));
}
