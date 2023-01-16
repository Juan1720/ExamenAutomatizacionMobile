#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items.

  @test
  Escenario: Iniciar sesión exitosamente
    Dado que me encuentro en el login de la app SwagLabs
    Cuando inicio sesión con las credenciales usuario: "standard_user" y contraseña: "secret_sauce"
    Entonces valido que debería aparecer el título de "PRODUCTS"
    Y también valido que al menos exista un item
