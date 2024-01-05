import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /*Realiza un programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por
        pantalla la longitud y el área de la circunferencia.
        (Longitud de la circunferencia = 2 * PI * Radio; Área de la circunferencia = PI * Radio * Radio) */
        Scanner lectura = new Scanner(System.in);
        System.out.println("Dime cuanto es el radio de la circunferencia");
        double radio = lectura.nextDouble();
        double PI = 3.14;
        double longitud = (2 * PI * radio);
        System.out.println("La Longitud de la circunferencia es " + longitud);
        double area = PI * (radio * radio);
        System.out.println("El área de la circunferencia es " + area);
    }
}
