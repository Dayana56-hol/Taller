#language: es

  Característica: Creacion de usuario
    Yo como cliente de brykamakeup
    necesito crear un usuario para realizar compras


  Escenario: Creacion de usuario
    Dado que un cliente necesita crear una cuenta
    Cuando registra los datos solicitados en la pagina
      |correo|dayanacGG3gfgfgoa1002.dc@mail.com|
      |contrasena|Dayana1202*|
    Entonces deberia quedar logueado
    Y poder cerrar sesion

