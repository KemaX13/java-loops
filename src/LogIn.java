import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        //Escribe un programa que pida al usuario ingresar un nombre de usuario y una contraseña, escribe un bucle que siga ejecutándose y devuelva 'Datos incorrectos por favor vuelve a intentar' mientras el nombre de usuario o la contraseña sean incorrectos.
        //Cuando el usuario y la contraseña sean correctos imprime en terminal: ¡Acceso concedido!

        String correctUsername = "Pepita";
        String correctPassword = "pepi123";

        Scanner scanner = new Scanner(System.in);

        String user = "";
        String password = "";

        while (!correctUsername.equals(user) || !correctPassword.equals(password)) {
            System.out.print("Ingresa usuario: ");
            user = scanner.nextLine();
            System.out.print("Ingresa contraseña: ");
            password = scanner.nextLine();

            if (!correctUsername.equals(user) || !correctPassword.equals(password))
                System.out.println("Datos incorrectos por favor vuelve a intentar");
        }

        System.out.println("¡Acceso concedido!");
    }
}
