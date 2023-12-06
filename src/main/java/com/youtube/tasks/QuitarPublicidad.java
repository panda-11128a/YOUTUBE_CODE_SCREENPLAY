package com.youtube.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;


import static com.youtube.UI.YouTubeVideoPage.SKIP_AD_BUTTON;

public class QuitarPublicidad implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(12000);
            actor.attemptsTo(
                    Click.on(SKIP_AD_BUTTON)
            );
        } catch (InterruptedException e) {

        }
    }

    public static QuitarPublicidad enVideo() {
        return new QuitarPublicidad();
    }
}
