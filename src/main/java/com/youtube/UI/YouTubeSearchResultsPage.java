package com.youtube.UI;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YouTubeSearchResultsPage {

    public static final Target LISTA_RESULTADOS = Target.the("Lista de resultados de videos")
            .located(By.xpath("(//*[@id=\"video-title\"])"));


}
