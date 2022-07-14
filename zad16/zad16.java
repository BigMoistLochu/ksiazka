package zadania.ksiazka.zad16;

public class zad16 {
    public static void main(String[] args)
    {
        //Temat algorytmy: Bubble Sorting


        int[] tablica = {574, 673, 34, 125, 8, 23,983};

        for(int i=0;i< tablica.length-1;i++)
        {
            int max = tablica[0];
            for(int k=0;k< tablica.length-1;k++)
            {
                if(max>tablica[k+1])
                {
                    tablica[k] = tablica[k+1];
                    tablica[k+1] = max;
                }
                else
                {
                    max = tablica[k+1];
                }

            }

        }

        for(int i=0;i< tablica.length;i++)
        {
            System.out.println(tablica[i]);
        }








    }
}
