package com.youtube.tasks;

import com.youtube.UI.YouTubeHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.type.Type;

public class EscribirEnBusqueda implements Task {

    private final String cancion;

    public EscribirEnBusqueda(String cancion) {
        this.cancion = cancion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Type.theValue(cancion).into(YouTubeHomePage.BARRA_BUSQUEDA)
        );
    }

    public static EscribirEnBusqueda elNombre(String cancion) {
        return new EscribirEnBusqueda(cancion);
    }
}
