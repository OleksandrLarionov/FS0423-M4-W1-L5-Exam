package entities;

import interfaces.Luminosita;
import interfaces.Volume;

public class RegistrazioneAudio extends ElementoMultimediale implements Volume {
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    @Override
    public void play() {
        System.out.println("Il titolo del video è:" +
                " " + titolo.toUpperCase() + "." +
                " " + "Il volume è impostato a:" +
                " " + "!".repeat(volume) + " " + "-" +
                " " + "La durata:" +
                " " + durata + "minuti" + ".");
    }

    @Override
    public void show() {
        System.out.println("Questa non è un Immagine");
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
