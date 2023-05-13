public class Child {
    private String gender;
    private int plural;
    private int age;
    private String race;
    private int parity;
    private int married;
    private int bwt;
    private int smokeN;
    private int drinkN;
    private int firstep;
    private int welfare;
    private String smoker;
    private String drinker;
    private int wpre;
    private int wgain;
    private int education;
    private int gestination;

    public Child(String data) {
        String[] attributes = data.split("//s");
        this.gender = attributes[0];
        this.plural = Integer.parseInt(attributes[1]);
        this.age = Integer.parseInt(attributes[2]);
        this.race = attributes[3];
        this.parity = Integer.parseInt(attributes[4]);
        this.married = Integer.parseInt(attributes[5]);
        this.bwt = Integer.parseInt(attributes[6]);
        this.smokeN = Integer.parseInt(attributes[7]);
        this.drinkN = Integer.parseInt(attributes[8]);
        this.firstep = Integer.parseInt(attributes[9]);
        this.welfare = Integer.parseInt(attributes[10]);
        this.smoker = attributes[11];
        this.drinker = attributes[12];
        this.wpre = Integer.parseInt(attributes[13]);
        this.wgain = Integer.parseInt(attributes[14]);
        this.education = Integer.parseInt(attributes[15]);
        this.gestination = Integer.parseInt(attributes[16]);
    }
    public String getRace() {
        return race;
    }
    public int getBwt() {
        return bwt;
    }

    public String getSmoker() {
        return smoker;
    }
    public int getGestination() {
        return gestination;
    }

    public String toString() {
        return gender;
    }
}

