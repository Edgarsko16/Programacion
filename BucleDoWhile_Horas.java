import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Realiza un programa que lea por teclado tres números enteros H, M, S correspondientes a hora, minutos y
        segundos respectivamente, y comprueba si la hora que indican es una hora válida.
            ● Supondremos que leemos una hora en modo 24 Horas, es decir, el valor válido
            para las horas será mayor o igual que cero y menor que 24.
            ● El valor válido para los minutos y segundos estará comprendido entre 0 y 59
            ambos incluidos*/
        Scanner lectura = new Scanner(System.in);
        int H, M, S;
        do {
            System.out.println("Dame tres números enteros");
            H = lectura.nextInt();
            M = lectura.nextInt();
            S = lectura.nextInt();
            if ((H>=0 && H<24) && (M>0 && M<60) && (S>0 && S<60)){
                System.out.println("La hora introducida es " + H + " horas " + M + " minutos y " + S + " segundos");
            }else
                System.out.println("La hora introducida no es válida");
        } while (!((H>=0 && H<24) && (M>0 && M<60) && (S>0 && S<60)));
    }
}
