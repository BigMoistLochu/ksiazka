package zadania.ksiazka.zad6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zad6 {
    public static void main(String[] args)
    {
        double a,b;
        Scanner scan = new Scanner(System.in);

        try{
            System.out.println("Podaj liczbe a: ");
            a = scan.nextInt();
            System.out.println("Podaj liczbe b: ");
            b = scan.nextInt();
            System.out.println("Pole prostokata rowna sie: " + (a*b));
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Tylko liczba!");
        }
        finally {
            System.out.println("Wykonuje sie zawsze nawet gdy pojawi sie blad np zamkniecie z baza danych");
        }




    }
}
