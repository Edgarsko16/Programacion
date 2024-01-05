import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Escribe un programa en Java que lea un número y calcule el área de un cuadrado (Área del cuadrado = lado * lado) */
        Scanner lectura = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero = lectura.nextInt();
        int areaCuadrado = numero * numero;
        System.out.println("El área de tu cuadrado es " + areaCuadrado);
    }
}
