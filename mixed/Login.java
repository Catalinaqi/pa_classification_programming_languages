import java.util.HashMap;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        HashMap<String, String> usuarios = new HashMap<>();
        usuarios.put("admin", "1234");
        usuarios.put("usuario", "abcd");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("Contraseña: ");
        String clave = scanner.nextLine();
        
        if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(clave)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        scanner.close();
    }
}