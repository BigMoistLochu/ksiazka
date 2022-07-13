package zadania.ksiazka.zad1;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args)
    {

        double a,b;
        Scanner scan = new Scanner(System.in); //tworzymy obiekt scanner
        System.out.println("Podaj bok a");//teoria: system to jakis obiekt
        //wynik metody println jest wrzucany do metody o nazwie out ktora ma obiekt System(wbudowany w jave)
        //nextInt() - odczytuje kolejną liczbę całkowitą
        //nextLine() - odczytuje kolejna ciag znakow
        //nextDouble() - odczytuje kolejną liczbę zmiennoprzecinkową,
        //nextBoolean() - odczytuje kolejną wartość typu boolean,
        a = scan.nextDouble();//do zmiennej a uzywamy metody ktora jest w obiekcie scan
        //skanuje nam to co wpiszemy w klawiaturze proste prawda?
        System.out.println("Podaj bok b");
        b = scan.nextDouble();
        System.out.println("Pole z bokow "+a+" i "+b+"wynosi "+ a*b);

    }
}
