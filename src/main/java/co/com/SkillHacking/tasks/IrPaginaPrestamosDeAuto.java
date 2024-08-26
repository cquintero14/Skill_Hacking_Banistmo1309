package co.com.SkillHacking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.SkillHacking.userinterface.PaginaPrestamos.*;
import net.serenitybdd.screenplay.actions.Scroll;

public class IrPaginaPrestamosDeAuto implements Task{
    public static IrPaginaPrestamosDeAuto irPrestamosAuto (){

        return Tasks.instrumented(IrPaginaPrestamosDeAuto.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(ESPACIO_BLANCO),
                Click.on(PRESTAMOS_AUTO)
        );

    }
}
