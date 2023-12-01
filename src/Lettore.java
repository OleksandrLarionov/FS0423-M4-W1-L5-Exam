import entities.ElementoMultimediale;
import entities.Video;

import java.util.Scanner;

public class Lettore {
    public static void main(String[] args) {
        ElementoMultimediale[] momoriaSdDelPlayer = new ElementoMultimediale[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un titolo");
        String titolo = scanner.nextLine();

        System.out.println("Inserisci la durata");
        int durata = scanner.nextInt();

        System.out.println("Inserisci il volume");
        int volume = scanner.nextInt();

        System.out.println("Inserisci la luminosita");
        int luminosita = scanner.nextInt();

        Video newVideoUno = new Video(titolo, durata, volume, luminosita);
        newVideoUno.play();
    }
}