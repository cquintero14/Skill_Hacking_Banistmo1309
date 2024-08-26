#author: Carlos Quintero
  #language: es

@HistoriaDeUsuario
Característica: Revisar el documento de prohibiciones en la pestaña tasas y tarifas de prestamos de autos regulares
  Yo como usuario
  quiero ingresar la pagina web de banistmo
  para revisar el documento de tasas y tarifas en la opción préstamos de auto


  @CasoRevisarDocumentoTasasyTarifas
  Escenario: Ir a la opción prestamos de autos regulares y revisar que el documento prohibiciones ubicado en la pestaña sea el correcto
    Dado que el usuario ingresa a la pagina de Banistmo
    Cuando se dirige a la opción Prestamos
    Y selecciona la opción Prestamos de auto, prestamos de automoviles regulares
    Y en la pestaña tasas y tarifas seleccione el documento prohibiciones
    Entonces se mostrará el documento en una nueva ventana emergente