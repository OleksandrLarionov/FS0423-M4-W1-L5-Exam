package entities;

public class RegistrazioneAudio extends ElementoMultimediale {
    public RegistrazioneAudio(String titolo, int durata) {
        super(titolo, durata);
    }

    @Override
    public void play() {
        System.out.println(titolo + durata);
    }

    @Override
    public void show() {
        System.out.println("Questa non è un Immagine");
    }
}
