import org.junit.Assert;
import org.junit.Test;



class IntComparatorTest {

    @Test
    public void compare() {
        IntComparator<Integer> ic = new IntComparator();

        Assert.assertEquals(1, ic.compare(1, 2));

    }
}