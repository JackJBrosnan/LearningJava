import java.util.ArrayList;

public class Receptionist {
    private String name;
    
	Receptionist(String name) {
        this.name = name;
	}

    void checkIn(ArrayList<Room> hotel, Customer customer) {
        String customerName = customer.getName();
        hotel.get(customer.getBooking() - 1).addOccupant(customer);
        System.out.println(name + " checked in " + customerName);
    }

    void checkOut(ArrayList<Room> hotel, Customer customer, Manager manager) {
        String customerName = customer.getName();
        hotel.get(customer.getBooking() - 1).removeOccupant(customer);
        System.out.println(name + " checked out " + customerName);
        manager.takeFeedback(manager, customer);
    }

}