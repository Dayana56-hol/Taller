#language: es

Característica: Anadir al carrito
  Yo como cliente de brykamakeup
  necesito anadir al carrito dos productos de categorias diferentes


  Antecedentes:
    Dado que un cliente necesita iniciar sesion
    Cuando registra diligencia sus datos
      | usuario    | dayanacordoba1002.dc-1836 |
      | contrasena | Dayana1202*               |

  Escenario:
    Dado que un cliente ingresa a la categoria de brochas
    Y ordena los productos de menor a mayor precio
    Cuando Selecciona dos productos de brochas
    Y dos productos de pestanas ordenandolos de menor a mayor precio de igual forma
    Entonces deberia ver los productos agregados en el carrito

