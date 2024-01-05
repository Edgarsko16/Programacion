import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escribe un programa Java que muestre por pantalla el texto “Bienvenido a mi primer programa en Java”.
        System.out.println("Bienvenido a mi primer programa en Java");
        /* Escribe un programa en Java que almacene en una variable el texto “Bienvenido a mi primer programa en Java” y
         luego lo muestre en pantalla.*/
        String mensaje = "Bienvenido a mi primer programa en Java";
        System.out.println(mensaje);
        /* Escriba un programa en Java que almacene en una variable el texto “Bienvenido a mi primer programa en Java” y
         en otra variable de texto el valor “alumno” y muestre por pantalla el mensaje siguiente “Bienvenido a mi primer
         programa en Java, alumno”.*/
        String alumno = "alumno";
        System.out.println(mensaje + " " + alumno);
        /*Escriba un programa Java que declare una variable con nombre mi_variable que almacene un valor entero
        (asígnale un valor entero) y muestre por pantalla el texto que diga “La variable mi_variable tiene el valor
         [valor]”, donde [valor] es el valor asignado. */
        int mi_variable = 5;
        System.out.println("La variable mi_variable tiene el valor " + mi_variable + " donde " + mi_variable + " es el valor asignado" );
        /* Escriba un programa Java que declare dos variables con nombres variable1 y variable2
        que almacene un valor entero cada una (asígnales un valor entero) y muestre por pantalla los textos:
            ● “variable1 tiene el valor [valor]”, donde [valor] es el valor asignado.
            ● “variable2 tiene el valor [valor]”, donde [valor] es el valor asignado.
            ● “variable1 + variable2 = [resultado de la suma]” */
        int variable1 = 2;
        int variable2 = 8;
        System.out.println("variable1 tiene el valor " + variable1 + " , donde " + variable1 + " es el valor asignado");
        System.out.println("variable2 tiene el valor " + variable2 + " , donde " + variable2 + " es el valor asignado");
        System.out.println("variable1 + variable2 = " + (variable1 + variable2));
        /* Escriba un programa Java que realice lo siguiente:
            ● Declare tres variables con nombres variable1, variable2 y resultado_suma.
            ● Asígnales un valor entero a variable1 y variable2.
            ● Realiza la suma de esas dos variables y guarda el resultado en la variable resultado_suma.
            ● Muestre por pantalla el texto:
                i. “variable1 tiene el valor [valor]”, donde [valor] es el valor asignado.
                ii. “variable2 tiene el valor [valor]”, donde [valor] es el valor asignado.
                iii. “variable1 + variable2 = [valor de variable resultado_suma]” */
        int resultado_suma = variable1 + variable2;
        System.out.println("variable1 + variable2 = " + resultado_suma);
        /* Escribe un programa Java que:
            ● Declare una variable entera v_entero y asígnale un valor.
            ● Sume a v_entero el valor 100
            ● Reste a v_entero el valor 5
            ● Multiplique por dos v_entero */
        int v_entero = 1;
        System.out.println("El valor inicial de v_entero es " + v_entero);
        v_entero = v_entero + 100;
        System.out.println("v_entero + 100 = " + v_entero);
        v_entero = v_entero - 5;
        System.out.println("v_entero - 5 = " + v_entero);
        v_entero = v_entero * 2;
        System.out.println("v_entero * 2 = " + v_entero);
        /*Realice un programa en Java que:
            ● Declare una variables y la inicialice a un valor (del tipo que quieras)
            ● Declare otra variable del mismo tipo
            ● Codifica la instrucción para que la segunda variable tome el valor de la primera
            (asigna a la segunda variable la primera variable)
            ● Imprime ambas variables por pantalla para comprobar que tienen el mismo valor*/
        int var1 = 5;
        int var2 = 0;
        var2 = var1;
        System.out.println("La variable var1 es " + var1 + " y la variable var2 es " + var2);
        /*Programa java que declare cuatro variables enteras A, B, C y D y asígnale un valor a cada una.
        A continuación realiza las instrucciones necesarias para que:
            ● B tome el valor de C
            ● C tome el valor de A
            ● A tome el valor de D
            ● D tome el valor de B */
        int A = 4;
        int B = 6;
        int C = 8;
        int D = 10;
        B = C;
        C = A;
        A = D;
        D = B;
        System.out.println("La variable A es " + A);
        System.out.println("La variable B es " + B);
        System.out.println("La variable C es " + C);
        System.out.println("La variable D es " + D);
        /* Escribe un programa en Java que pida un nombre y lo muestre por pantalla.
        *  Muestre por pantalla el texto “Bienvenido [nombre_leido]” donde [nombre_leido] es el nombre que se ha pedido
        * al usuario. */
        Scanner lectura = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre = lectura.next();
        System.out.println("Bienvenido " + nombre);
        /* Escribe un programa Java que lea dos números enteros por teclado (uno cada vez) y los muestre por pantalla */
        System.out.println("Dame dos números enteros");
        int num1 = lectura.nextInt();
        int num2 = lectura.nextInt();
        System.out.println("Los números que has introducido son " + num1 + " y " + num2);
        /* Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble
        (número * 2) y el triple (número * 3) de ese número */
        System.out.println("Dame un número entero");
        int num = lectura.nextInt();
        System.out.println("El doble de tu número es " + (num * 2));
        System.out.println("El triple de tu número es " + (num * 3));
        /* Escribe un programa en Java que lea el año de nacimiento y le calcule y muestre la edad que tiene. */
        int anyoNacimiento;
        int anyoActual = 2024;
        int edad;
        System.out.println("Dime tu año de nacimiento");
        anyoNacimiento = lectura.nextInt();
        edad = anyoActual - anyoNacimiento;
        System.out.println("Tú edad es " + edad);
    }
}
