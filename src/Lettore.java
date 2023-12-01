import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

public class Lettore {
    public static void main(String[] args) {
        ElementoMultimediale[] momoriaSdDelPlayer = new ElementoMultimediale[5];
//     *******************Creazione dei video/immagini da tastiera***************

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cosa vuoi creare? dei video delle immagine ? premi 1 per il video o 2 per l'immagine");
        String imputNumerico = scanner.nextLine();

        if (imputNumerico.equals("1")) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Inserisci un titolo");
                String titolo = scanner.nextLine();

                System.out.println("Inserisci la durata");
                int durata = Integer.parseInt(scanner.nextLine());

                System.out.println("Inserisci il volume");
                int volume = Integer.parseInt(scanner.nextLine());

                System.out.println("Inserisci la luminosita");
                int luminosita = Integer.parseInt(scanner.nextLine());

                momoriaSdDelPlayer[i] = new Video(titolo, durata, volume, luminosita);

            }
        } else if (imputNumerico.equals("2")) {
            for (int i = 0; i < 2; i++) {
                System.out.println("Inserisci un titolo");
                String titoloImmagine = scanner.nextLine();

                System.out.println("Inserisci la luminosita");
                int luminositaImmagine = Integer.parseInt(scanner.nextLine());

                momoriaSdDelPlayer[i] = new Immagine(titoloImmagine, luminositaImmagine);
            }

        }

        System.out.println("Questi sono gli elementi inseriti nella memoria");
        for (int i = 0; i < momoriaSdDelPlayer.length; i++) {
            System.out.println("indice n:" + (i + 1) + " " + momoriaSdDelPlayer[i]);
        }

        while (true) {
            System.out.print("Inserisci l'indice di quello che vuoi vedere ('0' per uscire): ");
            String stringaInserita = scanner.nextLine();

            if (stringaInserita.equals("0")) {
                System.out.println("Arrivederci, alla prossima!");
                scanner.close();
                break;
            }

            int indice = Integer.parseInt(stringaInserita) - 1;

            if (indice >= 0 && indice < momoriaSdDelPlayer.length) {
                ElementoMultimediale elemento = momoriaSdDelPlayer[indice];

                if (elemento instanceof Video) {
                    elemento.play();
                } else if (elemento instanceof Immagine) {
                    elemento.show();
                } else {
                    System.out.println("Non è ne uno ne altro");
                }
            } else {
                System.out.println("Numero non valido. Riprova.");
            }
        }
    }
}
