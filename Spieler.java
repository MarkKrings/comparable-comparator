package ComparableVsComparator;

public class Spieler implements Comparable<Spieler> {

    // Comparable vs Comparator --> Sortieren von Collections
    // Comparable sortiert nach einer natürlichen Ordnung
    // Comparator hat ein explizites Vergleichskriterium
    // Comparator benötigt eine eigene Klasse

    private String name;
    private int ranking;

    public Spieler() {

    }

    public Spieler(String name, int ranking) {
        this.name = name;
        this.ranking = ranking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public int compareTo(Spieler o) {
        return Integer.compare(ranking, o.getRanking());
    }

}
