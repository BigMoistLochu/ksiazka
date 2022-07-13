package zadania.ksiazka.zad8;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Math.*;

public class zad8 {
    public static void main(String[] args)
    {
        //zadanie utrwalajace: liczymy delte (ahh te powtorki)
        double a,b,c,delta,x1,x2;
        //wzory ax^2+bx+c
        //gdy delta > 0 to mamy 2 pierwiastki czyli x1 i x2
        //gdy delta = 0 to mamy 1 pierwiastek czyli x1
        //gdy delta < 0 to nie mamy rozwiazania
        //wzor gdy delta > 0 x1=-b-sqrt(delta)/2*a  x2=-b+sqrt(delta)/2*a
        //wzor gdy delta = 0 x1=-b/2*a

        Scanner scan = new Scanner(System.in);

        try{

            System.out.println("Podaj liczbe a: ");
            a = scan.nextInt();
            System.out.println("Podaj liczbe b: ");
            b = scan.nextInt();
            System.out.println("Podaj liczbe c: ");
            c = scan.nextInt();
            delta = b*b-4*a*c;

            if(a!=0)
            {
                if(delta>0)
                {
                    x1 = (-b-sqrt(delta))/2*a;
                    x2 = (-b+sqrt(delta))/2*a;
                    System.out.printf("Dla wartosci a: " + a + " b: "+ b + " c: " + c + " delta wynosi: " + delta + " i jej pierwiastki to x1: " + "%4.2f",x1);
                    System.out.printf(" x2: " + "%4.2f",x2);
                    System.out.printf("\n");
                }
                else if(delta==0)
                {
                    x1=-b/2*a;
                    System.out.printf("Dla wartosci a: " + a + " b: "+ b + " c: " + c + " delta wynosi: " + delta + " i jej pierwiastki to x1: " + "%3.2f",x1 + "\n");
                }
                else
                {
                    System.out.printf("Dla wartosci a: " + a + " b: "+ b + " c: " + c + " delta wynosi: " + delta + " i nie ma rozwiazan" + "\n");
                }

            }
            else
            {
                throw new InputMismatchException();
            }

        }
        catch(InputMismatchException ex)
        {
            System.out.println("Podaj inny znak niz liczbe albo a = 0!!!");
        }
        finally {
            System.out.println("Wykonuje sie zawsze nawet gdy pojawi sie blad np zamkniecie z baza danych");
        }




    }
}
