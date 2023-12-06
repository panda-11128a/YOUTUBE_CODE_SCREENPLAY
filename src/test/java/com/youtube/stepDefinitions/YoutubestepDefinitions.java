package com.youtube.stepDefinitions;


import com.youtube.questions.ValidarCancionEnResultados;
import com.youtube.tasks.*;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class YoutubestepDefinitions {
    String nombreCancion = "Juanes";

    @Before
    public void setupActor() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("El usuario abre el navegador y va a YouTube")
    public void elUsuarioAbreElNavegadorYVaAYouTube() {
        theActorCalled("Usuario").attemptsTo(
                OpenBrowser.enYouTube()
        );

    }
    @When("El usuario escribe {string} en la barra de búsqueda")
    public void elUsuarioEscribeEnLaBarraDeBúsqueda(String string) {
        theActorInTheSpotlight().attemptsTo(
                EscribirEnBusqueda.elNombre(nombreCancion )
        );

    }
    @When("El usuario hace clic en el botón de búsqueda")
    public void elUsuarioHaceClicEnElBotónDeBúsqueda() {
        theActorInTheSpotlight().attemptsTo(
                HacerClicEnBusqueda.enBoton()
        );

    }
    @When("El usuario hace clic en el video de la canción y quita la publicidad del video")
    public void elUsuarioHaceClicEnElVideoDeLaCanciónYQuitaLaPublicidadDelVideo() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionCancionAleatorio.conNombre(nombreCancion)
                //QuitarPublicidad.enVideo()
        );
    }

    @Then("La canción se reproduce correctamente y se valida que la canción correcta es mostrada en los resultados")
    public void laCancionSeReproduceCorrectamenteYSeValidaLaCancionCorrectaEnResultados() {
        theActorInTheSpotlight().should(
                seeThat("La canción se reproduce correctamente y se valida que la canción correcta es mostrada en los resultados",
                        ValidarCancionEnResultados.conTituloIgual())
        );
    }


}
