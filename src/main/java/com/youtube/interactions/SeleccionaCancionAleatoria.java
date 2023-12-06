package com.youtube.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.youtube.UI.YouTubeSearchResultsPage.LISTA_RESULTADOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionaCancionAleatoria implements Interaction {
    private static String nombreCancionSeleccionada;

    private final String nombreCancion;

    public SeleccionaCancionAleatoria(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String nombreCancionLowerCase = nombreCancion.toLowerCase();

        List<WebElementFacade> listCancionesYoutube = LISTA_RESULTADOS.resolveAllFor(actor);

        listCancionesYoutube.removeIf(elemento ->
                !elemento.getText().toLowerCase().contains(nombreCancionLowerCase)
        );

        if (!listCancionesYoutube.isEmpty()) {
            Random random = new Random();
            int indexRandom = random.nextInt(listCancionesYoutube.size());
            nombreCancionSeleccionada = listCancionesYoutube.get(indexRandom).getText();
            System.out.println("Canción seleccionada: " + nombreCancionSeleccionada);
            listCancionesYoutube.get(indexRandom).click();
        } else {
            System.out.println("No se encontraron resultados de búsqueda para la canción: " + nombreCancion);
        }
    }

    public static String getNombreCancionSeleccionada() {
        return nombreCancionSeleccionada;
    }

    public static Performable click(String nombreCancion) {
        return instrumented(SeleccionaCancionAleatoria.class, nombreCancion);
    }
}
