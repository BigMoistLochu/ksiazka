package zadania.ksiazka.zad19;

public class macierz {



    //metoda ktora wpisuje dane do tablicy
    //w tej metodzie trzeba wyslac jako argument tablice i zmienna reprezentujaca jej rozmiar
    public int[][] wpisywanie(int[][] macierza)
    {
        for(int i=0;i<10;i++)
        {
            for(int k=0;k<10;k++)
            {
                if(i==k)
                {
                    macierza[i][k] = i;
                }
                else
                {
                    macierza[i][k] = 0;
                }

            }
        }
        return macierza;
    }

    //metoda ktora wyswietla cala macierz
    public void pokaz(int[][] macierz)
    {
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

    }




}
