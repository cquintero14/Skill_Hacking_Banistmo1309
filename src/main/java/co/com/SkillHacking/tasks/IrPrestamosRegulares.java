package co.com.SkillHacking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import static co.com.SkillHacking.userinterface.PaginaPrestamosDeAuto.*;


public class IrPrestamosRegulares implements Task{
    public static IrPrestamosRegulares irPrestamosRegulares (){

        return Tasks.instrumented(IrPrestamosRegulares.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TITULO_PRESTAMOS),
                Click.on(PRESTAMOS_AUTO_REGULAR)
        );

    }
}
