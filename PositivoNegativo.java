import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /* Escribe un programa que solicite al usuario un número y luego determine si es positivo, negativo o cero.
        Imprime un mensaje indicando el resultado. */
        Scanner lectura = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero = lectura.nextInt();
        if (numero > 0){
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
            } else
                System.out.println("El número es igual a cero");
    }
}
