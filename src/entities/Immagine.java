package entities;

import interfaces.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }


    @Override
    public void play() {
        System.out.println("Questo non è un video");
    }

    @Override
    public void show() {
        System.out.println("Il titolo dell'immagine è:" +
                " " + titolo.toUpperCase() + "." +
                " " + "La luminosità è impostata a:" +
                " " + "*".repeat(luminosita) + ".");
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "titolo=" + titolo +
                ", luminosita='" + luminosita + '\'' +
                '}';
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }

}
