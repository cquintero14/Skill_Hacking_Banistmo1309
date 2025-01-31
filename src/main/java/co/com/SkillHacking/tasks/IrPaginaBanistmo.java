package co.com.SkillHacking.tasks;


import co.com.SkillHacking.userinterface.PaginaBanistmo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class IrPaginaBanistmo implements Task{

    PaginaBanistmo paginaBanistmo;
    public static IrPaginaBanistmo urlApp() { return Tasks.instrumented(IrPaginaBanistmo.class);}



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaBanistmo));

    }
}
