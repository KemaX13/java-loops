import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Escribe un bucle while que genere números aleatorios hasta que salga el número 7. Has de usar la función getRandomNumber
        int x = 0;

        while (x != 7) {
            x = getRandomNumber(8);
            System.out.println(x);
        }

        //Escribe un bucle while que genere números aleatorios hasta que salga un número mayor a 70. Has de usar la función getRandomNumber
        while (x < 70) {
            x = getRandomNumber(100);
            System.out.println(x);
        }

        //Escribe un bucle do while que genere un número aleatorio entre 1 y 100. El usuario debe adivinar el número aleatorio y el programa debe seguir solicitando intentos hasta que el usuario adivine correctamente. Después de cada intento, el programa debe indicar si el número ingresado es mayor o menor que el número generado. Has de usar la función getRandomNumber

        Scanner scanner = new Scanner(System.in);
        int randomNumber = getRandomNumber(100);
        int input;

        do {
            System.out.print("Adivina el número entre 1 y 100: ");
            input = scanner.nextInt();

            if (input > randomNumber) {
                System.out.println("El número es menor");
            } else if (input < randomNumber) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("Correcto!");
            }
        } while (input != randomNumber);

        scanner.close();
    }

    /**
     * Function name: getRandomNumber
     * 
     * @param number (int)
     * @return (int)
     * 
     * Inside the function:
     * 1. choose a random integer between 1 and the number given
     */
    public static int getRandomNumber(int number){
        return (int)(Math.random() * number) + 1;
    }
}
