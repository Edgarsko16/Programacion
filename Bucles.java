public class Main {
    public static void main(String[] args) {
        /* Realice un programa que muestre los números desde el 1 hasta el 100. Crea tres programas uno utilizando la
        estructura while, otro usando for y otro usando el do-while.*/
        /** Bucle do while
        int numeros = 1;
        do {
            System.out.println(numeros);
            numeros++;
        }while (numeros <= 100);  **/

        /** Bucle while
        int numeros = 1;
        while (numeros <= 100){
            System.out.println(numeros);
            numeros++;  **/
        
        int numeros;
        for (numeros = 1; numeros <= 100; numeros++){
            System.out.println(numeros); 
        }
    }
}
