import org.junit.Assert;
import org.junit.Test;


public class LComparatorTest {

    @Test
    public void getNumberOfDigits() {
        Assert.assertEquals(3, LComparator.getNumberOfDigits(100));
        Assert.assertEquals(0, LComparator.getNumberOfDigits(1));
        Assert.assertEquals(4, LComparator.getNumberOfDigits(1000));
    }
}