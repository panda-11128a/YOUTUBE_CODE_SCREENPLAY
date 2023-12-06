Feature: Reproducir una canción en YouTube

  Scenario: Reproducir una canción en YouTube
    Given El usuario abre el navegador y va a YouTube
    When El usuario escribe "<nombre_de_la_cancion>" en la barra de búsqueda
    And El usuario hace clic en el botón de búsqueda
    And El usuario hace clic en el video de la canción y quita la publicidad del video
    Then La canción se reproduce correctamente y se valida que la canción correcta es mostrada en los resultados
