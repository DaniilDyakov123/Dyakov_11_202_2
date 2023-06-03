public class User {
    private String surname;
    private int id;
    private int year;
    public User(String data) {
        String[] attributes = data.split("\\s");
        this.surname = attributes[0];
        this.year = Integer.parseInt(attributes[1]);
        this.id = Integer.parseInt(attributes[2]);
    }
    public String getName(){
        return this.surname;
    }
    public int getYear(){
        return this.year;
    }
    public int getId() {
        return this.id;
    }

    public String toString() {
        return surname + " " + year + " " + id;
    }

}
