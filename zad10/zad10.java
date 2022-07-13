package zadania.ksiazka.zad10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zad10 {

    public static void main(String[] args)
    {

        //zad z pentli nr 1
        for(int i=0; i<=10; i++){
            int y = 3 * i;
            System.out.println(y);
        }
        System.out.println("Koniec Pentli For");

        //zad z pentli nr 2
        int i = 0;
        do {
            int y = 3*i;
            i = i + 1;

            System.out.println(y);
        }
        while(i<=10);
        System.out.println("Koniec Pentli Do-While");

        i = 0;
        //zad z pentli nr 3
        while(i<=10)
        {
            int y = 3*i;
            i = i + 1;
            System.out.println(y);
        }
        System.out.println("Koniec Pentli While");

        //zad z pentli nr 4
        for(int k=1; k<=20; k++){
            System.out.println(k);
        }
        System.out.println("Koniec Pentli for z zadania 4");
        //zad z pentli nr 5
        int suma = 0;
        for(int k=1; k<=100; k++){
            if(k%2==0)
            {
                suma=suma+k;
            }
        }
        System.out.print("Suma liczb parzystych od 1 do 100: ");
        System.out.println(suma);
        System.out.println("Koniec Pentli for z zadania 5");
        //zad 6
        char znak;
        for(znak = 'a'; znak<='z'; znak++){
            System.out.println(znak);
        }
        System.out.println("Koniec Pentli for z zadania 6");


    }
}
