import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        /* Realiza un programa que calcule el precio de venta de un producto. Lee el precio por unidad (sin IVA) del
        producto y el porcentaje de IVA aplicado. (El precio de venta se calcula: precio por unidad * IVA / 100) */
        Scanner lectura = new Scanner(System.in);
        System.out.println("¿Cuántas unidades has cogido?");
        int cantidad = lectura.nextInt();
        System.out.println("Dime el precio del producto");
        double precio = lectura.nextDouble();
        System.out.println("Indica el porcentaje de IVA aplicado");
        double IVA = lectura.nextDouble();
        double precioFinal = ((precio * cantidad) * IVA / 100);
        System.out.println("El precio final de la venta es " + precioFinal);
    }
}
