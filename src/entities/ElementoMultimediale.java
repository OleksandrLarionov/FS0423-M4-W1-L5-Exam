package entities;

public abstract class ElementoMultimediale {
    public String titolo;
    public int durata;

    // Costruttore
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public ElementoMultimediale(String titolo, int durata) {
        this.titolo = titolo;
        this.durata = durata;
    }

    //Metodi
    public abstract void play();

    public abstract void show();
}
