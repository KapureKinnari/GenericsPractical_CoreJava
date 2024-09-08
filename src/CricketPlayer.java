public class CricketPlayer extends Player {

    private double StrikeRate;

    public CricketPlayer(String name, int jerseyNo, double strikeRate) {
        super(name, jerseyNo);
        StrikeRate = strikeRate;
    }

    public double getStrikeRate() {
        return StrikeRate;
    }

    public void setStrikeRate(double strikeRate) {
        StrikeRate = strikeRate;
    }

    @Override
    public String  toString() {
        return "CricketPlayer{" +
                "StrikeRate=" + StrikeRate +
                "} " + super.toString();
    }
}
