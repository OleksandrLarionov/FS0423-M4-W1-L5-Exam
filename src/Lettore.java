import entities.ElementoMultimediale;
import entities.Video;

import java.util.Scanner;

public class Lettore {
    public static void main(String[] args) {
//        ElementoMultimediale[] momoriaSdDelPlayer = new ElementoMultimediale[5];
/*      *******************Creazione dei video da tastiera***************
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
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
       scanner.close();
   */
//       *************** Procedo con la creazione statica dei video per i test************
        ElementoMultimediale[] momoriaSdDelPlayer = new ElementoMultimediale[5];
        Video videoUno = new Video("Batman", 140, 4, 5);
        Video videoDue = new Video("Avengers", 300, 4, 5);
        Video videoTre = new Video("Superman", 68, 4, 5);
        Video videoQuattro = new Video("Spiderman", 180, 4, 5);
        Video videoCinque = new Video("Flash", 120, 4, 5);

        momoriaSdDelPlayer[0] = videoUno;
        momoriaSdDelPlayer[1] = videoDue;
        momoriaSdDelPlayer[2] = videoTre;
        momoriaSdDelPlayer[3] = videoQuattro;
        momoriaSdDelPlayer[4] = videoCinque;
//***************Mostra i film Salvati*************
        for (ElementoMultimediale elemento : momoriaSdDelPlayer) {
            System.out.println(elemento);
        }
//        ***************Esecuzione del video*************
        videoDue.play();
    }
}