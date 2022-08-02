import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;

    @Before
    public void before() {
        busStop = new BusStop("Bus Stop 5");
    }

    @Test
    public void queueStartsEmpty() {
        assertEquals(0, busStop.queueCount());
    }

    @Test
    public void canAddPassengerToQueue() {
        Person person = new Person();
        busStop.addPassenger(person);
        assertEquals(1, busStop.queueCount());
    }
}
