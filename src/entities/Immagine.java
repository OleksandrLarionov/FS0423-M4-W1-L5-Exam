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
    public void aumentaLuminosita() {
        this.luminosita ++;
    }

    @Override
    public void diminuisciLuminosita() {
    if(this.luminosita > 0){
        this.luminosita --;
    }
    }
}
