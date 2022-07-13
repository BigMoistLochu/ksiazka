package zadania.ksiazka.zad4;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class zad4 {
    public static void main(String[] args)
    {

        //zad oblicz objetosc kuli
        // Objętość kuli V = 4/3 * Π * r³ gdzie r to promień kuli.
        //double power = Math.pow(first, second);
        double r,objetosc;

        System.out.println("Podaj promien kuli");
        Scanner scan = new Scanner(System.in);
        r = scan.nextDouble();
        objetosc =  (4*Math.PI * Math.pow(r,3))/3;

        System.out.printf("Objetosc kuli dla r = " + r + "wynosi: "+ "%3.2f",objetosc);





    }
}
