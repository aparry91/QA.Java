package BlackjackTest;

import Blackjack.Blackjack;
import org.junit.Assert;
import org.junit.Test;

public class BlackjackTest {

    @Test public void testBlackJack() {
         Blackjack blackjack = new Blackjack();
        Assert.assertEquals(blackjack.blackjack(21,18),21);
        Assert.assertEquals(blackjack.blackjack(21,21),21);
        Assert.assertEquals(blackjack.blackjack(22,22),0);
        Assert.assertEquals(blackjack.blackjack(15,18),18);
        Assert.assertEquals(blackjack.blackjack(22,18),18);
    }
}
