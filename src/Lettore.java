import entities.ElementoMultimediale;
import entities.Video;

import java.util.Scanner;

public class Lettore {
    public static void main(String[] args) {
        ElementoMultimediale[] momoriaSdDelPlayer = new ElementoMultimediale[5];
//     *******************Creazione dei video da tastiera***************
        Scanner scanner = new Scanner(System.in);

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
        System.out.println("Questi sono gli elementi inseriti nella memoria");
        for (int i = 0; i < momoriaSdDelPlayer.length; i++) {
            System.out.println("indice n:" + (i + 1) + " " + momoriaSdDelPlayer[i]);
        }
        while (true) {
            System.out.print("Inserisci il numero del video che vuoi vedere ('0' per uscire): ");
            String stringaInserita = scanner.nextLine();

            if (stringaInserita.equals("0")) {
                System.out.println("Arrivederci, alla prossima!");
                scanner.close();
                break;
            }

            int indiceVideo = Integer.parseInt(stringaInserita) - 1;

            if (indiceVideo >= 0 && indiceVideo < momoriaSdDelPlayer.length) {
                ElementoMultimediale elemento = momoriaSdDelPlayer[indiceVideo];

                if (elemento instanceof Video) {
                    ((Video) elemento).play();
                } else {
                    System.out.println("L'elemento selezionato non è un video riproducibile.");
                }
            } else {
                System.out.println("Numero non valido. Riprova.");
            }
        }

//       *************** Procedo con la creazione statica dei video per i test************
//        ElementoMultimediale[] momoriaSdDelPlayer = new ElementoMultimediale[5];
//        Video videoUno = new Video("Batman", 140, 4, 5);
//        Video videoDue = new Video("Avengers", 300, 4, 5);
//        Video videoTre = new Video("Superman", 68, 4, 5);
//        Video videoQuattro = new Video("Spiderman", 180, 4, 5);
//        Video videoCinque = new Video("Flash", 120, 4, 5);
//
//        momoriaSdDelPlayer[0] = videoUno;
//        momoriaSdDelPlayer[1] = videoDue;
//        momoriaSdDelPlayer[2] = videoTre;
//        momoriaSdDelPlayer[3] = videoQuattro;
//        momoriaSdDelPlayer[4] = videoCinque;
//          ***************Mostra i film Salvati*************
//        ***************Esecuzione del video*************
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.print("Inserisci il numero del video che vuoi vedere ('0' per uscire): ");
//            String stringaInserita = scanner.nextLine();
//            if (stringaInserita.equals("0")) {
//                System.out.println("Arrivederci, alla prossima!");
//                break;
//            }
//            switch (stringaInserita) {
//
//                case "1":
//                    videoUno.play();
//                    break;
//                case "2":
//                    videoDue.play();
//                    break;
//                case "3":
//                    videoTre.play();
//                    break;
//                case "4":
//                    videoQuattro.play();
//                    break;
//                case "5":
//                    videoCinque.play();
//                    break;
//                default:
//                    System.out.println("Non è presente nella lista");
//                    break;
//            }
//        }
    }
}
