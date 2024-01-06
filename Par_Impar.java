import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /* Realiza un programa Java que lea un número entero por teclado y calcule si es par o impar.
        (Un número es par si el resto de dividir el número entre 2 es igual a cero. En caso contrario el número es impar).
        Imprime un mensaje indicando el resultado. */
        Scanner lectura = new Scanner(System.in);
        System.out.println("Dame un número entero");
        int num = lectura.nextInt();
        int operacion = num % 2;
        if (operacion == 0){
            System.out.println("El número es par");
        } else
            System.out.println("El número es impar");
    }
}
