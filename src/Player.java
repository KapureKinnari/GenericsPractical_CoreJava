public abstract class Player {

    protected String Name;
    protected int JerseyNo;

    public Player(String name, int jerseyNo) {
        Name = name;
        JerseyNo = jerseyNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getJerseyNo() {
        return JerseyNo;
    }

    public void setJerseyNo(int jerseyNo) {
        JerseyNo = jerseyNo;
    }

    @Override
    public String toString() {
        return "Player{" +
                "Name='" + Name + '\'' +
                ", JerseyNo=" + JerseyNo +
                '}';
    }
}
