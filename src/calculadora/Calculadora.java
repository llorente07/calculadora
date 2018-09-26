package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double n1;
        double n2;

        System.out.print("Numero 1");
        n1 = in.nextDouble();

        System.out.print("Numero 2:");
        n2 = in.nextDouble();

    public int suma( double n1 , n2){
    
        suma sum = new Suma(n1, n2);

    sum.mostrarResultado ();
    
    }

    Resta res = new Resta(n1, n2);

    res.mostrarResultado ();

//multiplicacion
    Multiplicacion mul = new Multiplicacion(n1, n2);

    mul.mostrarResultado ();

//division
    Division div = new Division(n1, n2);

    div.mostrarResultado ();
}
}
