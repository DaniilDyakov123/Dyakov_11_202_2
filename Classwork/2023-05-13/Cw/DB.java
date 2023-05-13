import java.util.ArrayList;
import java.util.List;

public class DB {
    public List<Child> children = new ArrayList<>();
    public String[] races = {"white", "black", "hispanic", "asian", "other"};


    public List<Child> getChildren() {
        return children;
    }
    public String getRace(Child c){
        return c.getRace();
    }

    public void averageBwt() { //Task01
        int total = 0;
        int count = 0;
        for (int i = 0; i < races.length; i++) {
            for (int j = 0; j < children.size(); j++) {
                if (children.get(j).getRace() == races[i]) {
                    total += children.get(i).getBwt();
                    count ++;

                }
            }
            System.out.println(races[i] + " " + total / count);
            total = 0;
            count = 0;
        }
    }

    public boolean smokerVsNotSmoker() {//Task02
        int totalSmoker = 0;
        int countSmoker = 0;
        int totalNotSmoker = 0;
        int countNotSmoker = 0;
        for (int i = 0; i < children.size(); i++) {
            if (children.get(i).getSmoker() == "N") {
                totalNotSmoker += children.get(i).getGestination();
                countNotSmoker ++;
            } else {
                totalSmoker += children.get(i).getGestination();
                countSmoker ++;
            }
        }
        return totalSmoker / countSmoker < totalNotSmoker / countNotSmoker;

    }




}