import org.junit.Test;
import static org.junit.Assert.*;

public class BusTest {

    @Test
    public void testBusCount(){

        int passengers = 30;
        int capacity = 50;

        assertTrue(passengers <= capacity);

    }
}