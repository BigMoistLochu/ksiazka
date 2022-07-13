package zadania.ksiazka.zad7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zad7 {

    public static void main(String[] args)
    {
        //zadanie sprawdzamy czy to trojkat prostokatny(warunki if w javie)
        int a,b,c;
        Scanner scan = new Scanner(System.in);

        try{

            System.out.println("Podaj liczbe a: ");
            a = scan.nextInt();
            System.out.println("Podaj liczbe b: ");
            b = scan.nextInt();
            System.out.println("Podaj liczbe c: ");
            c = scan.nextInt();
            if(a>0 && b>0 && c>0)
            {
                if((a*a+b*b)==(c*c))
                {
                    System.out.println("Da sie zrobic trojkat prostokatny");
                }
                else
                {
                    System.out.println("Nie da sie zrobic trojkata prostokatnego");
                }
            }
            else
            {
                throw new InputMismatchException();
            }
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Jakis Bok jest ujemny wiec nie mozna z nich zrobic trojkata prostokatnego");
        }
        finally {
            System.out.println("Wykonuje sie zawsze nawet gdy pojawi sie blad np zamkniecie z baza danych");
        }




    }
}
