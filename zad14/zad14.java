package zadania.ksiazka.zad14;

public class zad14 {
    public static void main(String[] args)
    {
        //Temat Tablice dwuwymiarowe: Zad 1
        //zad: stworz macierz 10x10 w ktorej po jej przekatnej beda same jednynki a reszta to zera
        //oraz wyswietl sume jedynek
        int macierz[][] = new int[10][10];
        int suma = 0;
        int pomocnicza=9;
        for(int i=0;i<10;i++)
        {
            for(int k=0;k<10;k++)
            {
                if(k==pomocnicza)
                {
                    macierz[i][k] = 1;
                    pomocnicza = pomocnicza-1;
                    suma=suma+1;
                }
                else
                {
                    macierz[i][k] = 0;
                }
            }
        }

        for(int i=0;i<10;i++)
        {
            for(int k=0;k<10;k++)
            {
                if(k==9)
                {
                    System.out.println(macierz[i][k]);
                }
                else
                {
                    System.out.print(macierz[i][k]);
                }
            }
        }
        System.out.println(suma);







    }
}
