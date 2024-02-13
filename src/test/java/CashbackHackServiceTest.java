import org.junit.Assert;
import org.junit.Test;
import ru.netology.CashbackHackService;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

@Test
    public void cashbackUnderLimit() {
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(expected, actual); ;
    }
    @Test
    public void cashbackOverLimit() {
        int actual = service.remain(1100);
        int expected = 900;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void cashbackEqualLimit() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected,actual);

    }
}
