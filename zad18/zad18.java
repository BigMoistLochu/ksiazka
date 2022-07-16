package zadania.ksiazka.zad18;



public class zad18 {

    public static void main(String[] args)
    {
        //tutaj bedziemy odpalac metody naszych obiektow i tworzyc obiekty

        obliczanie_pierwiastka obiekt = new obliczanie_pierwiastka();

        obiekt.czytaj_dane();
        obiekt.przetworz_dane();
        obiekt.wyswietl_dane();

        System.out.println(obiekt);
        System.out.println(obiekt.toString());
    }
}
