package zadania.ksiazka.zad9;

import java.util.Scanner;
import java.util.Random;

public class zad9 {

    public static void main(String[] args) {
        //zadanie na randomowe liczby z przedzialu oraz zabawa zeby uzytkownik zgadnal dana liczbe

        Random rand = new Random();
        int zgadnij_liczbe;
        int random_liczba = rand.nextInt(10);//metoda nextInt klasy rand ktora importujesz przez java.util.Random

        //wyjdziemy troche poza schemat i zrobimy to w pentli while

        Scanner scan = new Scanner(System.in);

        System.out.println("Zgadnij jaka to liczba z przedzialu od 0-9: ");
        zgadnij_liczbe = scan.nextInt();

        do {

            if(zgadnij_liczbe == random_liczba)
            {
                System.out.printf("Brawo twoja liczba to: " + zgadnij_liczbe + " a wylosowana to:  " + random_liczba);
            }
            else
            {
                System.out.printf("Sprobuj ponownie: ");
                zgadnij_liczbe = scan.nextInt();
            }
        }
        while (zgadnij_liczbe != random_liczba);//np czy prawda jest ze 3 != 4 tak 3 jest rozne od 4 wiec da true wiec warunek bedzie spelniony i lecimy dalej


    }
}
