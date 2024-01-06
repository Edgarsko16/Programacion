import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /* Realiza un programa Java para comprobar si un año es bisiesto. El programa pide que se introduzca el valor de
         un año por teclado y calcula si es un año bisiesto o no lo es.
        (Un año es bisiesto si es divisible por 4 y no lo es por 100 o si es divisible por 400.)*/
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escribe un año");
        int anyo = lectura.nextInt();
        boolean esBisiesto = (anyo % 4 == 0 && (anyo % 100 != 0 || anyo % 400 == 0));
        if (esBisiesto){
            System.out.println("El año es bisiesto");
        }else
            System.out.println("El año no es bisiesto");
    }
}
