import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Desarrolla un programa que clasifique a una persona en una categoría de edad. Pide al usuario ingresar su edad
        y muestra un mensaje indicando si es niño (menores a 13 años), adolescente (entre 13 y 18), adulto joven (entre 19 y 30)
        o adulto (mayores de 30 años). */
        Scanner lectura = new Scanner(System.in);
        int edad;
        System.out.println("Introduce tu edad");
        edad = lectura.nextInt();
        if (edad < 13){
            System.out.println("Eres niño, tu edad es " + edad);
        } else if (edad >= 13 && edad <= 18) {
            System.out.println("Eres adolescente, tu edad es " + edad);
        } else if (edad >= 19 && edad <= 30) {
            System.out.println("Eres adulto joven, tu edad es " + edad);
        } else
                System.out.println("Eres adulto, tu edad es " + edad);
    }
}
