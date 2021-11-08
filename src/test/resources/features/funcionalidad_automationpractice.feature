#language:es

@funcionalidad

  Característica: Validar todas las funcionalidades del programa automationpractice


    @registronuevousuario

    Escenario: Registro de usuario
      Dado que el usuario no cuenta con usuario ingresa al modulo para registrarse
      Cuando ingresar todos los datos y envia su solicitud
       Entonces se valida si el registro fue exitoso

    @registrodesesion

    Escenario: Iniciar sesion
      Dado que el usuario se encuentra en el modulo para iniciar sesion
      Cuando ingresar su usuario y contrasena y envia la solicitud
      Entonces se valida que el inicio fue exitoso


    @compraexitosa

    Escenario: Compra de vestidos
      Dado que el usuario se encuentra en el catalogo de vestidos
      Cuando selecciona dos vestidos y finaliza su compra
      Entonces se valida que la compra fue exitosa
