package zadania.ksiazka.zad17;

import java.util.Scanner;

public class pole_prostokata implements Obiekt{
    public double a,b,pole;
    Scanner scan = new Scanner(System.in);

    public void czytaj_dane()
    {
        System.out.println("Podaj bok a: ");
        a = scan.nextDouble();
        System.out.println("Podaj bok b: ");
        b = scan.nextDouble();
    }


    public void przetworz_dane()
    {
        pole = a*b;
        System.out.println(pole);
    }

    public void wyswietl_dane()
    {
        System.out.println("Pole prostokata o bokach: " + a + " i " + b +" rowna sie: ");
    }






}
