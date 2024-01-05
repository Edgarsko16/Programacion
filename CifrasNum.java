import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /*Realiza un programa que lea un número entero de 5 cifras y muestre sus cifras igual que en el ejemplo.
        Por ejemplo para un número N = 12345 La salida debe ser:
            1 → Se obtiene dividiendo el número entre 10000
            12 → Se obtiene dividiendo el número entre 1000
            123 → Se obtiene dividiendo el número entre 100
            1234 → Se obtiene dividiendo el número entre 10
            12345 → Es el número */
        Scanner lectura = new Scanner(System.in);
        System.out.println("Dame un número de 5 cifras");
        int num = lectura.nextInt();
        System.out.println("El primer número que se obtiene es " + (num / 10000));
        System.out.println("El segundo número que se obtiene es " + (num / 1000));
        System.out.println("El tercero número que se obtiene es " + (num / 100));
        System.out.println("El cuarto número que se obtiene es " + (num / 10));
        System.out.println("El quinto número que se obtiene es " + (num / 1));
    }
}
