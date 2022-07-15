package zadania.ksiazka.zad18;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class obliczanie_pierwiastka {

    double a,b,c,delta,x1,x2;
    Scanner scan = new Scanner(System.in);

    public void wpisz_dane()
    {
        try
        {
            System.out.println("Podaj liczbe a: ");
            a = scan.nextDouble();
            if(a==0)
            {
                throw new InputMismatchException();
            }
            System.out.println("Podaj liczbe b: ");
            b = scan.nextDouble();
            System.out.println("Podaj liczbe c: ");
            c = scan.nextDouble();

        }
        catch(InputMismatchException ex)
        {
            System.out.println("Tylko liczba!");
        }

    }



    public void przetworz_dane()
    {
        delta = b*b-4*a*c;
        if(delta>0) {
            x1 = (-b - sqrt(delta)) / 2 * a;
            x2 = (-b + sqrt(delta)) / 2 * a;
        }
        else if(delta==0)
        {
            x1=-b/2*a;
        }
    }

    public void pokaz_dane()
    {
        if(delta>=0)
        {
            System.out.printf("Dla wartosci a: " + a + " b: "+ b + " c: " + c + " delta wynosi: " + delta + "\n");
        }
        else
        {
            System.out.printf("Dla wartosci a: " + a + " b: "+ b + " c: " + c + " delta wynosi: " + delta + " i nie ma rozwiazan" + "\n");
        }
    }



}
