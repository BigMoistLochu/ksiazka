package zadania.ksiazka.zad19;



public class zad19 {
    public static void main(String[] args)
    {
        //tutaj bedziemy odpalac metody naszych obiektow i tworzyc obiekty
        int[][] macierz1 = new int[10][10];
        int[][] macierz2 = new int[10][10];
        macierz test1 = new macierz();

        test1.wpisywanie(macierz1);
        test1.pokaz(test1.wpisywanie(macierz1));
    }
}
