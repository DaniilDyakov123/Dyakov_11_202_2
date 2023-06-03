public class Task46 {
    static class BonusCard {
        private int bonuses;

        public int getBonuses() {
            return bonuses;
        }

        public BonusCard(int bonuses) {
            this.bonuses = bonuses;
        }

        public boolean use(int n) throws AtataException {
            if (bonuses >= n) {
                bonuses -= n;
                System.out.println(bonuses + " left.");
                return true;
            } else {
                throw new AtataException("OOOOOPS");
            }
        }

    }
    static class Human extends Thread {
        private BonusCard bonusCard;
        private String who;
        public Human(BonusCard bc, String who) {
            this.bonusCard = bc;
            this.who = who;
        }
        public void shoppingWithBonuses(int bonuses) throws AtataException { if (bonusCard.getBonuses() >= bonuses) {
            System.out.println(who + " is gonna buy something.");
            if (bonusCard.use(bonuses)) {
                System.out.println(who + " bought something.");
            }
        }
        else {
            System.out.println("Sorry, Honey, no money."); }
        }
        public void run() {
            for (int i = 0; i < 100; i++) {
                try {
                    shoppingWithBonuses(7);
                } catch (AtataException e) {
                    throw new RuntimeException(e);
                }
            } }
    }

    public static void main(String[] args) {
        BonusCard bc = new BonusCard(150);
        Human husband = new Human(bc, "John");
        Human wife = new Human(bc, "Mary");
        husband.start();
        wife.start();
    }
}
