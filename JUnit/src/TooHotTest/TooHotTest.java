package TooHotTest;

import TooHot.TooHot;
import org.junit.Assert;
import org.junit.Test;


public class TooHotTest {


    @Test public void testTooHot() {
        TooHot tooHot = new TooHot();
        Assert.assertEquals(tooHot.tooHot(60, true),true);
        Assert.assertEquals(tooHot.tooHot(59, true),false);
        Assert.assertEquals(tooHot.tooHot(100, true),true);
        Assert.assertEquals(tooHot.tooHot(101, true),false);
        Assert.assertEquals(tooHot.tooHot(60, false),true);
        Assert.assertEquals(tooHot.tooHot(59, false),false);
        Assert.assertEquals(tooHot.tooHot(90, false),true);
        Assert.assertEquals(tooHot.tooHot(91, false),false);


    }
}
