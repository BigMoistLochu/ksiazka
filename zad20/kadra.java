package zadania.ksiazka.zad20;

public class kadra extends osoba{

    String wyksztalcenie,stanowisko;
    public kadra(String imie, String nazwisko, String miasto, String wyksztalcenie, String stanowisko) {
        super(imie, nazwisko, miasto);
        this.wyksztalcenie = wyksztalcenie;
        this.stanowisko = stanowisko;
    }



    public void drukuj1()
    {
        drukuj();
        System.out.println("Wyksztalcenie: " + wyksztalcenie + " stanowisko: " + stanowisko);
    }

}
