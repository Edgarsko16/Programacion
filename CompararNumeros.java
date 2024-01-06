import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /* Escribe un programa que solicite al usuario ingresar dos números (primero pide un número y lo lee, y luego
        pide el otro y lo lee) y luego determine cual de los dos número es mayor. Imprime un mensaje indicando el resultado. */
        Scanner lectura = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero1 = lectura.nextInt();
        System.out.println("Dame otro número");
        int numero2 = lectura.nextInt();
        if (numero1 > numero2){
            System.out.println("El número1 es mayor");
        } else if (numero1 < numero2) {
            System.out.println("El número2 es mayor");
            } else
                System.out.println("Los números son iguales");
    }
}
