import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Realiza un programa que lea una variable entera llamada mes y compruebe si el valor corresponde a un mes de
         30 días, de 31 o de 28. Supondremos que febrero tiene 28 días. Se mostrará un texto indicando el nombre del mes
         correspondiente y el número de días que tiene. Se debe comprobar que el valor introducido esté comprendido
         entre 1 y 12.*/
        Scanner lectura = new Scanner(System.in);
        int mes;
        System.out.println("Introduce el número del mes");
        mes = lectura.nextInt();
        switch (mes){
            case 1:
                System.out.println("Enero tiene 31 días");
                break;
            case 2:
                System.out.println("Febrero tiene 28 días");
                break;
            case 3:
                System.out.println("Marzo tiene 31 días");
                break;
            case 4:
                System.out.println("Abril tiene 30 días");
                break;
            case 5:
                System.out.println("Mayo tiene 31 días");
                break;
            case 6:
                System.out.println("Junio tiene 30 días");
                break;
            case 7:
                System.out.println("Julio tiene 31 días");
                break;
            case 8:
                System.out.println("Agosto tiene 31 días");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 días");
                break;
            case 10:
                System.out.println("Octubre tiene 31 días");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 días");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 días");
                break;
            default:
                System.out.println("El valor introducido no corresponde a ningún mes");
        }
    }
}
