import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /* Desarrolla un programa que pida al usuario ingresar tres números enteros y determine cuál es el mayor de ellos.
         Imprime un mensaje indicando el resultado.*/
        Scanner lectura = new Scanner(System.in);
        System.out.println("Dame tres números enteros");
        int num1 = lectura.nextInt();
        int num2 = lectura.nextInt();
        int num3 = lectura.nextInt();
        if (num1 > num2 && num1 > num3){
            System.out.println("El número 1 es el mayor");
        } else if (num1 < num2 && num2 > num3) {
            System.out.println("El número 2 es el mayor");
            } else if (num1 < num3 && num2 < num3) {
            System.out.println("El número 3 es el mayor");
            } else
                System.out.println("Los números no son válidos");
    }
}
