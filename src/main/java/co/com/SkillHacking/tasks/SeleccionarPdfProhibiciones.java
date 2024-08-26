package co.com.SkillHacking.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.SkillHacking.userinterface.PaginaPrestamosDeAutoRegulares.*;
import co.com.SkillHacking.interactions.CambiarPestaña;

public class SeleccionarPdfProhibiciones implements Task{
    public static SeleccionarPdfProhibiciones seleccionarPdf (){

        return Tasks.instrumented(SeleccionarPdfProhibiciones.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PESTAÑA_BENEFICIOS),
                Click.on(PESTAÑA_TASAS),
                Click.on(PDF_PROHIBICIONES),
                CambiarPestaña.andWait()

        );



    }
}
