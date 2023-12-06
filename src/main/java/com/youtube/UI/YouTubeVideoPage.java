package com.youtube.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YouTubeVideoPage {
    public static final Target PRIMER_VIDEO_TITLE = Target.the("Título del primer video")
            .located(By.xpath("//*[@id=\"title\"]/h1"));
    public static final Target SKIP_AD_BUTTON = Target.the("Botón para saltar la publicidad")
            .located(By.xpath("//*[@id=\"skip-button:5\"]/span/button"));
    public static final Target VIDEO_PROGRESS_BAR = Target.the("Barra de progreso video")
            .located(By.xpath("//*[@id=\"skip-button:5\"]/span/button"));

    // Puedes agregar más localizadores según sea necesario
}