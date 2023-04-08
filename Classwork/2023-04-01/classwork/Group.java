public class Group {
    private int id;
    private String name;
    private String city;
    public Group(String data) {
        String[] attributes = data.split("\\s");
        this.id = Integer.parseInt(attributes[0]);
        for (int i = 1; i < attributes.length - 1; i++) {
            this.name += attributes[i] + " ";
        }
        this.city = attributes[attributes.length - 1];
    }
    public int getId() {
        return this.id;
    }
    public String getCity() {return this.city;}
    public String getName() {return this.name;}
}
