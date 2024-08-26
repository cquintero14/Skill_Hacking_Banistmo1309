package co.com.SkillHacking.stepdefinitions;

import co.com.SkillHacking.tasks.*;
import co.com.SkillHacking.questions.ValidarPdf;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class StepDefinitions {
    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("que el usuario ingresa a la pagina de Banistmo")
    public void AbrirPaginaBanistmo() {
        OnStage.theActorCalled("actor").wasAbleTo(IrPaginaBanistmo.urlApp());

    }
    @Cuando("se dirige a la opción Prestamos")
    public void IrALaPaginaPrestamos() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrPaginaPrestamos.irPrestamos());
    }
    @Y("selecciona la opción Prestamos de auto, prestamos de automoviles regulares")
    public void IrPaginaPrestamosRegulares() {
        OnStage.theActorInTheSpotlight().attemptsTo(IrPaginaPrestamosDeAuto.irPrestamosAuto());
        OnStage.theActorInTheSpotlight().attemptsTo(IrPrestamosRegulares.irPrestamosRegulares());

    }
    @Y("en la pestaña tasas y tarifas seleccione el documento prohibiciones")
    public void SeleccionarArchivoPDF() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarPdfProhibiciones.seleccionarPdf());
    }
    @Entonces("se mostrará el documento en una nueva ventana emergente")
    public void ValidarArchivoPdf() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat
                (ValidarPdf.pdfCorrecto()));
    }
}
