package com.youtube.questions;


import com.youtube.UI.YouTubeVideoPage;
import com.youtube.interactions.SeleccionaCancionAleatoria;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidarCancionEnResultados implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String tituloDuranteReproduccion = Text.of(YouTubeVideoPage.PRIMER_VIDEO_TITLE).answeredBy(actor).toLowerCase();
        String nombreCancionSeleccionada = SeleccionaCancionAleatoria.getNombreCancionSeleccionada().toLowerCase();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            // Maneja la excepción de interrupción
            e.printStackTrace();
        }

        return !tituloDuranteReproduccion.isEmpty() && tituloDuranteReproduccion.equals(nombreCancionSeleccionada);

    }

    public static ValidarCancionEnResultados conTituloIgual() {
        return new ValidarCancionEnResultados();
    }
}
