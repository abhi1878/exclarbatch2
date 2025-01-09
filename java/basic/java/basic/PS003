public class Bowler {
    String name;
    int wickets;
    int matches;
    int ballsBowled;
    int runsConceded;

    // Default constructor
    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.ballsBowled = 0;
        this.runsConceded = 0;
    }

    // Parameterized constructor
    public Bowler(String name, int wickets, int matches, int ballsBowled, int runsConceded) {
        this.name = name;
        this.wickets = wickets;
        this.matches = matches;
        this.ballsBowled = ballsBowled;
        this.runsConceded = runsConceded;
    }

    // Method to compute bowling average
    void computeBowlingAverage() {
        if (wickets != 0) {
            System.out.println("Bowling Average of " + name + ": " + (double) runsConceded / wickets);
        } else {
            System.out.println("Wickets is zero, cannot compute bowling average.");
        }
    }
}
