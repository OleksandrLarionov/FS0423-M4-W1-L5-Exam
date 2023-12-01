package entities;

public class Immagine extends ElementoMultimediale {
    public Immagine(String titolo){
        super(titolo);
    }

    @Override
    public void play() {
        System.out.println("Questo non è un video");
    }

    @Override
    public void show() {
        System.out.println(titolo);
    }
}
