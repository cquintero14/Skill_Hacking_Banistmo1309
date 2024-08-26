package co.com.SkillHacking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.SkillHacking.userinterface.PaginaBanistmo.*;


public class IrPaginaPrestamos  implements Task{
    public static IrPaginaPrestamos irPrestamos (){

        return Tasks.instrumented(IrPaginaPrestamos.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        if (BOTON_COOKIES.resolveFor(actor).isVisible()){
            actor.attemptsTo(
                    Click.on(BOTON_COOKIES),
                    Click.on(SECCION_PRODUCTOS),
                    Click.on(OPCION_PRESTAMOS)
            );
        }else {
            actor.attemptsTo(
                    Click.on(SECCION_PRODUCTOS),
                    Click.on(OPCION_PRESTAMOS)
            );
        }


    }
}
