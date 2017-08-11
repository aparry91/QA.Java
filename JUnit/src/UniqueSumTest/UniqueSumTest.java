package UniqueSumTest;

import UniqueSum.UniqueSum;
import org.junit.Assert;
import org.junit.Test;

public class UniqueSumTest {


    @Test public void testUniqueSum() {
        UniqueSum uniqueSum = new UniqueSum();
        Assert.assertEquals(uniqueSum.uniqueSum(6,6,6),0);
        Assert.assertEquals(uniqueSum.uniqueSum(6,6,2),2);
        Assert.assertEquals(uniqueSum.uniqueSum(2,6,6),2);
        Assert.assertEquals(uniqueSum.uniqueSum(6,2,6),2);
        Assert.assertEquals(uniqueSum.uniqueSum(1,2,3),6);

    }
    }
