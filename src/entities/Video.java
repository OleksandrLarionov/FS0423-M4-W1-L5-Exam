package entities;

import interfaces.Luminosita;
import interfaces.Volume;

public class Video extends ElementoMultimediale implements Volume, Luminosita {
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        System.out.println("Il titolo del video è:" +
                " " + titolo.toUpperCase() + "." +
                " " + "Il volume è impostato a:" +
                " " + "!".repeat(volume) + " " + "-" +
                " " + "La luminosità è impostata a:" +
                " " + "*".repeat(luminosita) + ".");
    }

    @Override
    public void show() {
        System.out.println("Questa non è un Immagine");
    }

    @Override
    public String toString() {
        return "Video{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                '}';
    }

    // override dell'interface
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

    @Override
    public void abbassaVolume() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    @Override
    public void alzaVolume() {
        this.volume++;
    }
}
