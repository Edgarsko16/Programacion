import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /* Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit, y muestre el resultado por
         pantalla. (La fórmula correspondiente para pasar de grados centígrados a fahrenheit es: 𝐹 = 32 + (9 * 𝐶 / 5) ) */
        Scanner lectura = new Scanner(System.in);
        System.out.println("Dime cuantos grados centigrados quieres convertir a grados Fahrenheit");
        int centigrados = lectura.nextInt();
        int fahrenheit = 32 + (9 * centigrados / 5);
        System.out.println("Hay " + centigrados + " grados centigrados y " + fahrenheit + " grados fahrenheit");
    }
}
