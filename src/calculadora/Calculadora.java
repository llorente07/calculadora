package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num1, num2;

        System.out.println("Numero1: ");
        num1 = in.nextInt();

        System.out.println("Numero2: ");
        num2 = in.nextInt();
        
        System.out.println ("Suma: " + num1 + num2 + "= " + suma);
    

    public static int suma(int num1, int num2) {

        int suma = num1 + num2;

        return suma;
    }

}
}
