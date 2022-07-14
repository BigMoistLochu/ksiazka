package zadania.ksiazka.zad15;

public class zad15 {
    public static void main(String[] args)
    {
        //Temat Tablice dwuwymiarowe: Zad 1
        //zad: stworz macierz 10x10 w ktorej po jej przekatnej beda same jednynki a reszta to zera
        //oraz wyswietl sume jedynek
        int macierz[][] = new int[10][10];
        int suma1 = 0;
        int suma2 = 0;
        int liczba=0;
        int liczba2=0;
        for(int i=0;i<10;i++)
        {
            for(int k=0;k<10;k++)
            {
                if(k==0)
                {
                    macierz[i][k] = liczba;
                    suma1=suma1+liczba;
                    liczba = liczba+1;
                }
                else if(k==1)
                {
                    macierz[i][k] = liczba2*liczba2;
                    suma2=suma2+liczba2*liczba2;
                    liczba2 = liczba2+1;
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
        System.out.println(suma1);
        System.out.println(suma2);






    }
}
