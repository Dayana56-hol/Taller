#language: es

Característica: Realizar proceso de compra
  Yo como cliente de brykamakeup
  necesito realizar el proceso de compra de los productos seleccionados

  Antecedentes:
    #INICIO DE SESION
    Dado que un cliente necesita iniciar sesion
    Cuando registra diligencia sus datos
      |usuario|dayanacordoba1002.dc-1836|
      |contrasena|Dayana1202*|
    #AGREGAR PRODUCTOS AL CARRITO
    Y dos productos de pestanas ordenandolos de menor a mayor precio de igual forma

    Escenario:
      Dado que un cliente necesita realizar el pago de los productos al finalizar la compra
      Cuando diligencia los datos personales y forma de pago
      Entonces debe ver detalle de pedido generado
