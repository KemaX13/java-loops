public class ForLoops {
    public static void main(String[] args) {

        //Escribe un bucle for que imprima números del 1 al 10
        for (int i = 1; i < 11; i++) {
            System.out.println("El valor de i es: " + i);
        }

        //Escribe un bucle for que imprima "¡Hola FemCoders!" 5 veces
        for (int i = 0; i < 5; i++) {
            System.out.println("¡Hola FemCoders!");
        }

        //Escribe un bucle for que imprima la tabla de multiplicar del número 7 (del 1 al 10)
        for (int i = 0; i < 11; i++) {
            System.out.println("Resultado: " + (i * 7));
        }

        //Escribe un bucle for que imprima números del 10 al 1 
        for (int i = 10; i > 0; i--) {
            System.out.println("Resultado: " + i);
        }

        //Escribe un bucle for que imprima los 10 primeros números impares
        int x = 0;
        int y = 0;

        while (x < 10) {
            if (y % 2 != 0) {
                System.out.println("El valor de i es: " + y);
                x++;
            }

            y++;
        }

        //Escribe un bucle for que encuentre el número más pequeño que sea mayor a 20 y que sea divisible para 8, usando 'break'.
        //Imprime: El número más pequeño mayor de 20 que es divisible para 8 es <result>
        int result;

        for (int i = 21; ; i++) {
            if (i % 8 == 0) {
                result = i;
                break;
            }
        }

        System.out.println("Resultado: " + result);

        //Escribe un bucle for que imprima números pares del 1 al 20 saltando los números impares usando 'continue'
        for (int i = 1; i < 21; i++) {
            if (i % 2 != 0)
                continue;

            result = i;
            System.out.println("Par: " + result);
        }
    }
}