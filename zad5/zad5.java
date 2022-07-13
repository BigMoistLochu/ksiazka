package zadania.ksiazka.zad5;

import java.util.Scanner;

public class zad5
{
    public static void main(String[] args)
    {
        float a,b;
        Scanner scan = new Scanner(System.in);


        System.out.println("Podaj liczbe a: ");
        a = scan.nextInt();
        System.out.println("Podaj liczbe b: ");
        b = scan.nextInt();

        System.out.printf("Dodawanie: " + a + " + " + b + " = " + (a+b) + "\n");
        System.out.printf("Odejmowanie: " + a + " - " + b + "=" + (a-b)+ "\n");
        System.out.printf("Mnozenie: " + a + " * " + b + "=" + (a*b)+ "\n");
        System.out.printf("Dzielenie: " + a + " / " + b + "=" + (a/b));
    }
}
