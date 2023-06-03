import junit.framework.TestCase;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
class Player {
    private String name;
    private int hp = 100;
    public Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getHP() {
        return this.hp;
    }
}

public class Task04 {
    public class TestPlayer extends TestCase {
        Player p1;
        @Before
        public static void setUpBeforeClass() {
            p1 = new Player("Enrique");
        }
        @Test
        public void testHpOnStartShouldBe100() {
            Assert.assertEquals(100, p1.getHP());
        }
        @After
        public void testPlayerShouldHaveName() {
            Assert.assertNotNull(p1.getName());
        }
    }
}
