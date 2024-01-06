import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /* Realiza un programa que lea un número entero y muestre si el número es múltiplo de 10.
        (Un número entero es múltiplo de 10 si al dividirlo por 10 el resto de esta división es cero).
        Imprime un mensaje indicando el resultado */
        Scanner lectura = new Scanner(System.in);
        System.out.println("Dame un número entero");
        int num = lectura.nextInt();
        int operacion = num % 10;
        if (operacion == 0){
            System.out.println("El número es múltiplo de 10");
        } else
            System.out.println("El número no es múltiplo de 10");
    }
}
