package zadania.ksiazka.zad21;

import zadania.ksiazka.zad20.kadra;
import zadania.ksiazka.zad20.osoba;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class zad21 {
    public static void main(String[] args) throws IOException {


        File f = new File("C:\\Users\\krokk\\IdeaProjects\\Zadania-Ksiazka-Java\\src\\zadania\\ksiazka\\zad21\\data.txt");
        FileWriter obiektNR1 = new FileWriter("C:\\Users\\krokk\\IdeaProjects\\Zadania-Ksiazka-Java\\src\\zadania\\ksiazka\\zad21\\data.txt",true);
        Formatter fm = new Formatter(obiektNR1);
        Scanner scan = new Scanner(System.in);

        Scanner sf = new Scanner(f);
        System.out.println("Podaj jakis tekst ktory chcesz wpisac: ");
        String Tekst = scan.nextLine();

        fm.format("%s \r\n", Tekst);
        fm.close();
        obiektNR1.close();
        System.out.println("wpisalismy cos");

        while(sf.hasNextLine())
        {
            System.out.println(sf.nextLine());
        }

        scan.close();
        sf.close();





    }


}
