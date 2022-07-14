package zadania.ksiazka.zad11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zad11 {
    public static void main(String[] args)
    {
        //Temat Tablice: Zad 1

        int tablica[] = new int[10];
        int dane[] = new int[10];
        // tworzymy obiekt tablica ktora ma 10 miejsc w pamieci i chcemy wlozyc tam liczby od 0-9
        //mozna to zrobic za pomoca pentli for
        for(int i=0;i<10;i++)
        {
            tablica[i] = i;
            System.out.println("Jest to "+ i +" miejsce w tablicy a ma wartosc: " + tablica[i]);
        }
        System.out.println("Koniec zadania 1");
        //zad 2
        for(int i=0;i<10;i++)
        {

            dane[i] = dane.length - i-1;

        }

        for(int i=0;i<10;i++)
        {

            System.out.println("miejsce w tablicy a ma wartosc: " + dane[i]);
        }
        System.out.println("Koniec zadania 2");




    }
}
