package zadania.ksiazka.zad20;

import java.util.Scanner;

public class osoba {
    String imie,nazwisko,miasto;

    public osoba(String imie, String nazwisko, String miasto) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
    }

    public void drukuj()
    {
        System.out.println("Twoje imie: " + imie + " Nazwisko: " + nazwisko + " Miasto: " + miasto);
    }


}
