package ComparableVsComparator;

import java.util.Comparator;

public class SpielerComparator implements Comparator<Spieler> {

    @Override
    public int compare(Spieler o1, Spieler o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
