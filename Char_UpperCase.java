import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /* Realiza un programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
        (Puedes utilizar dos opciones para comprobar si el caracter es mayúsculas:
            ● Usando el método Character.isUpperCase(letra) donde letra es el carácter leido por teclado. Esta función
             devuelve true o false, en función de si es mayúscula o no respectivamente
            ● Haciendo la comprobación de que la letra es mayor o igual al caracter ‘A’ y menor o igual al caracter ‘Z’) */
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe un carácter");
        char letra = lectura.next().charAt(0);
        boolean esMayuscula = Character.isUpperCase(letra);
        System.out.println("El carácter es mayúscula: " + esMayuscula);
    }
}
