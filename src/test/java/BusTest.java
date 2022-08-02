import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person;

    @Before
    public void before() {
        bus = new Bus("Glasgow", 3);
        person = new Person();
    }

    @Test
    public void hasDestination() {
        assertEquals("Glasgow", bus.getDestination());
    }

    @Test
    public void hasCapacity() {
        assertEquals(3, bus.getCapacity());
    }

    @Test
    public void passengersStartsEmpty() {
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canAddPassengers() {
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cantAddPassengersWhenAtCapacity() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(3, bus.passengerCount());
    }

    @Test
    public void removePassenger() {
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());
    }
}
