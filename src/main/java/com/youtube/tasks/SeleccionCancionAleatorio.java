package com.youtube.tasks;

import com.youtube.interactions.SeleccionaCancionAleatoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionCancionAleatorio implements Task {

    private final String nombreCancion;

    // Constructor que acepta el nombre de la canción como parámetro
    public SeleccionCancionAleatorio(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SeleccionaCancionAleatoria.click(nombreCancion)
        );
    }

    public static SeleccionCancionAleatorio conNombre(String nombreCancion) {
        return instrumented(SeleccionCancionAleatorio.class, nombreCancion);
    }
}
