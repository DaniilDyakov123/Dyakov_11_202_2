public class Main {
    public static void main(String[] args) {
        //Collection<Integer> iac =  new IntArrayCollection();
        IntLinkedCollection iac =  new IntLinkedCollection();
        System.out.println(iac.size() == 0);
        iac.add(1);
        System.out.println(iac.size() == 1);
        for (int i = 0; i < 200; i++) {
            iac.add(i);
        }
        System.out.println(iac.isEmpty());
        iac.clear();
        for (int i = 0; i < iac.size(); i++) {
            System.out.println();
        }
        iac.clear();
        System.out.println(iac.isEmpty());
        System.out.println(iac.contains(1));
    }
}
