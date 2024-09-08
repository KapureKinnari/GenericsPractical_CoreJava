public class FootballPlayer extends Player {

    private int goal;

    public FootballPlayer(String name, int jerseyNo, int goal) {
        super(name, jerseyNo);
        this.goal = goal;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "FootballPlayer{" +
                "goal=" + goal +
                "} " + super.toString();
    }
}
