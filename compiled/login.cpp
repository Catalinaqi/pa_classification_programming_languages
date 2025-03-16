#include <iostream>
#include <map>
#include <string>

using namespace std;

int main() {
    map<string, string> usuarios;

    // Insertar elementos manualmente asegurando std::string
    usuarios.insert(make_pair(string("admin"), string("1234")));
    usuarios.insert(make_pair(string("usuario"), string("abcd")));

    string usuario, clave;

    cout << "Usuario: ";
    cin >> usuario;
    cout << "Contraseña: ";
    cin >> clave;

    if (usuarios.find(usuario) != usuarios.end() && usuarios[usuario] == clave) {
        cout << "Acceso concedido" << endl;
    } else {
        cout << "Acceso denegado" << endl;
    }

    return 0;
}
