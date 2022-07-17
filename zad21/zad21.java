package zadania.ksiazka.zad21;

import zadania.ksiazka.zad20.kadra;
import zadania.ksiazka.zad20.osoba;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Scanner;

public class zad21 {
    public static void main(String[] args) throws IOException {



        FileWriter obiektNR1 = new FileWriter("C:\\Users\\krokk\\IdeaProjects\\Zadania-Ksiazka-Java\\src\\zadania\\ksiazka\\zad21\\data.txt",true);
        Formatter fm = new Formatter(obiektNR1);
        Scanner scan = new Scanner(System.in);
        String Tekst = scan.nextLine();

        fm.format("%s \r\n", Tekst);
        fm.close();
        obiektNR1.close();
        System.out.println("wpisalismy cos");





    }


}
