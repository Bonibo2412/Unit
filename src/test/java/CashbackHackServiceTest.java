import org.testng.annotations.Test;
import ru.netology.CashbackHackService;
import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

@Test
    public void cashbackUnderLimit() {
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }
    @Test
    public void cashbackOverLimit() {
        int actual = service.remain(1100);
        int expected = 900;
        assertEquals(actual, expected);
    }
    @Test
    public void cashbackEqualLimit() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);

    }
}
