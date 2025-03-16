# login.py
usuarios = {"admin": "1234", "usuario": "abcd"}

usuario = input("Usuario: ")
clave = input("Contraseña: ")

if usuario in usuarios and usuarios[usuario] == clave:
    print("Acceso concedido")
else:
    print("Acceso denegado")