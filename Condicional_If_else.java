import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /* Realice un programa Java que lea un número entero por teclado y calcule si es mayor a cero o no.
        El programa debe mostrar los texto “El número [número] es mayor a cero” o “El número [número] es menor o igual
        que cero” donde [número] es el número leído. */
        Scanner lectura = new Scanner(System.in);
        System.out.println("Dame un número entero");
        int num = lectura.nextInt();
        if (num > 0){
            System.out.println("El número " + num + " es mayor a cero");
        } else if (num < 0) {
            System.out.println("El número " + num + " es menor a cero");
        } else {
            System.out.println("El número es igual");
        }
    }
}
