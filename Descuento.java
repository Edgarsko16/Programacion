import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Escribe un programa que calcule el descuento en una compra según el valor total. Si el valor es mayor o igual
        a 100€, aplica un descuento del 10%. Si es mayor o igual a 50€ pero menor a 100€, aplica un descuento del 5%.
        De lo contrario, no hay descuento. Muestra el valor final.*/
        Scanner lectura = new Scanner(System.in);
        double valorInicial = 0.0;
        double descuento;
        double valorFinal;
        System.out.println("Introduce el valor del producto");
        valorInicial = lectura.nextDouble();
        if (valorInicial >= 100){
            descuento = valorInicial * 0.10;
            valorFinal = valorInicial - descuento;
            System.out.println("Se ha aplicado un descuento del 10%, el valor final del producto es " + valorFinal);
        }else if (valorInicial >= 50 && valorInicial < 100){
            descuento = valorInicial * 0.05;
            valorFinal = valorInicial - descuento;
            System.out.println("Se ha aplicado un descuento del 5%, el valor final del producto es " + valorFinal);
        }else
            System.out.println("No se puede aplicar ningún descuento");
    }
}
