public class User {
    private int id;
    private String name;
    private String surname;
    private String city;
    private int year;
    public User(String data) {
        String[] attributes = data.split("\\s");
        this.id = Integer.parseInt(attributes[0]);
        this.name = attributes[1];
        this.surname = attributes[2];
        this.city = attributes[3];
        this.year = Integer.parseInt(attributes[4]);
    }
    public String getSurname(){
        return this.surname;
    }
    public int getYear(){
        return this.year;
    }
    public int getId() {
        return this.id;
    }
    public String getCity() {return this.city;}
    public String getName() {return this.name;}

    public String toString() {
        return id + " " + name + " " + surname + " " + city + " " + year;
    }

}
