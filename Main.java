package ComparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Spieler s1 = new Spieler("Sophia", 2);
        Spieler s2 = new Spieler("Anna", 1);
        Spieler s3 = new Spieler("Elena", 4);
        Spieler s4 = new Spieler("Helmut", 3);


        List<Spieler> spielerList = new ArrayList<>();
        spielerList.add(s1);
        spielerList.add(s2);
        spielerList.add(s3);
        spielerList.add(s4);

        for (Spieler spieler:spielerList) {
            System.out.println(spieler.getName());
        }
        System.out.println("--------");

        // Hier wird der Vergleich mit dem Comparator durchgeführt
        // -> es werden 2 Parameter übergeben (wie in der SpielerComparator Methode)

        Collections.sort(spielerList, new SpielerComparator());

        for (Spieler spieler:spielerList) {
            System.out.println(spieler.getName());
        }
        System.out.println("--------");

        // Hier wird der Vergleich durch die CompareTo Methode durchgeführt
        // -> hier wird nur 1 Parameter übergeben (wie in der compareTo Methode)

        Collections.sort(spielerList);

        for (Spieler spieler:spielerList) {
            System.out.println(spieler.getName()+ " mit dem Ranking " + spieler.getRanking());
        }

    }
}
