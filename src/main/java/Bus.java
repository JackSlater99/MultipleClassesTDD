import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int passengerCount() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        int currentPassengers = passengerCount();
        if (currentPassengers + 1 > capacity) {
            return;
        } else {
        passengers.add(person);
        }

    }

    public void removePassenger(Person person) {
        passengers.remove(person);
    }
}
