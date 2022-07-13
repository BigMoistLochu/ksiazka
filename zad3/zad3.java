package zadania.ksiazka.zad3;

import static java.lang.Math.sqrt;//zeby uzywac pierwiastka dodajemy bibloteke

public class zad3 {
    public static void main(String[] args)
    {
        //
        //    %s formats strings.
        //    %d formats decimal integers.
        //    %f formats floating-point numbers.
        //    %t formats date/time values.

        float pi,pierwiastek;
        pi = (float)Math.PI;//mozna zrzutowac matha pi na floata roznica to rozmiar bitow
//      System.out.printf(format, arguments);
        pierwiastek = (float) sqrt(pi);
        System.out.printf("%3.2f",pierwiastek);
        //wystwietla 6 pol gdzie 5 z tego to liczba po przecinku





    }
}
