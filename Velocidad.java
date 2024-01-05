import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /* Realiza un programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
        (La fórmula es velocidad*1000/3600) */
        Scanner lectura = new Scanner(System.in);
        System.out.println("Dame la velocidad actual");
        double velocidad = lectura.nextDouble();
        System.out.println("La velocidad es " + velocidad + " Km/h");
        double metros = (velocidad * 1000 / 3600);
        System.out.println("La velocidad es " + metros + " m/s");
    }
}
