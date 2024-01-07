import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Realiza un programa java para convertir una calificación numérica en alfabética. El programa lee por teclado
        una calificación numérica entre 0 y 10 y muestra por pantalla su correspondiente calificación alfabética.
            ● La equivalencia entre la calificación numérica y la alfabética se muestra en esta tabla:
            Nota Numérica Nota Alfabética
            0 <= nota < 5 Insuficiente
            5 <= nota < 6 Suficiente
            6 <= nota < 7 Bien
            7 <= nota < 9 Notable
            9 <= nota <= 10 Sobresaliente
            Si la calificación introducida no es válida se muestra un mensaje indicándolo y el
            programa finaliza.*/
        Scanner lectura = new Scanner(System.in);
        int calificacion;
        System.out.println("Escribe la calificación obtenida");
        calificacion = lectura.nextInt();
        if (calificacion >= 0 && calificacion < 5){
            System.out.println("Insuficiente");
        } else if (calificacion == 5) {
            System.out.println("Suficiente");
        } else if (calificacion == 6) {
            System.out.println("Bien");
        } else if (calificacion >= 7 && calificacion <= 8) {
            System.out.println("Notable");
        } else if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("Sobresaliente");
        } else
            System.out.println("El valor introducido no corresponde a ninguna calificación");
    }
}
