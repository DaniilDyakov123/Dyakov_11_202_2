public class AnalyticsService {
    public void getLastNamesBeforeYear(int year, DB db) {
        for (int i = 0; i < db.users.size(); i++) {
            if (db.users.get(i).getYear() < year) {
                System.out.println(db.users.get(i).getName());
            }
        }
    }
    public int getNumberByYear(int year, DB db) {
        int count = 0;
        for (int i = 0; i < db.users.size(); i++) {
            if (db.users.get(i).getYear() ==year) {
                count++;
            }
        }
        return count;
    }
    public void getSubscriptionsNames(int id, DB db) {//доделать
        for (int i = 0; i < db.users.size(); i++) {
            if (db.users.get(i).getId() == id) {
                //u1 = db.users.get(i);
                break;
            }
        }
    }
}
