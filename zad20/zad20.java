package zadania.ksiazka.zad20;

public class zad20 {
    public static void main(String[] args)
    {

        osoba czlowiek1 = new osoba("Konrad","Krok","Gdynia");
        kadra nauczyciel = new kadra("Konrad","Krok","Gdynia","Doktor","Wykladowca");
        czlowiek1.drukuj();
        nauczyciel.drukuj1();
        //czyli tak dziedziczyc moze pola i metody(metody mozna uzywac w klasach dziedziczacych ale nie mozna ich nadpisywac)
        //nadpisywac mozna gdy mamy interfejs albo klase abstrakcyjna
        //prawda ze proste????
    }
}
