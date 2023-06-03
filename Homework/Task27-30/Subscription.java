public class Subscription {
    private User u1;
    private User u2;

    public Subscription(String data, DB db) {
        String[] attributes = data.split("\\s");
        int id1 = Integer.parseInt(attributes[0]);
        int id2 = Integer.parseInt(attributes[1]);
        for (int i = 0; i < db.users.size(); i++) {
            if (db.users.get(i).getId() == id1) {
                u1 = db.users.get(i);
                break;
            }
        }
        for (int i = 0; i < db.users.size(); i++) {

            if (db.users.get(i).getId() == id2) {
                u2 = db.users.get(i);
                break;
            }
        }
    }
    public String toString(){
        return u1.getName() + " подписан на " + u2.getName();
    }
}
