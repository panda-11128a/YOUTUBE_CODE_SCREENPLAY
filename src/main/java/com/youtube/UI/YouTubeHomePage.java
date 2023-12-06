package com.youtube.UI;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YouTubeHomePage {
    public static final Target BARRA_BUSQUEDA = Target.the("Barra de búsqueda")
            .located(By.xpath("(//*[@id=\"search\"])[3]"));

    public static final Target BOTON_BUSQUEDA = Target.the("Botón de búsqueda")
            .located(By.xpath("//*[@id='search-icon-legacy']"));
}