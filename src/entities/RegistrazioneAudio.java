package entities;

import interfaces.Luminosita;
import interfaces.Volume;

public class RegistrazioneAudio extends ElementoMultimediale implements Luminosita, Volume {
    private int volume;
    private int luminosita;

    public RegistrazioneAudio(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        System.out.println(titolo + durata);
    }

    @Override
    public void show() {
        System.out.println("Questa non è un Immagine");
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

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public String toString() {
        return "RegistrazioneAudio{" +
                "titolo='" + titolo + '\'' +
                ", durata=" + durata +
                " " + "minuti" +
                '}';
    }
}
