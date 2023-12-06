package com.youtube.tasks;
import com.youtube.UI.YouTubeHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class HacerClicEnBusqueda implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(YouTubeHomePage.BOTON_BUSQUEDA)
        );
    }

    public static HacerClicEnBusqueda enBoton() {
        return new HacerClicEnBusqueda();
    }
}
