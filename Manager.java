public class Manager {
	private String name;
	
    Manager(String name) {
        this.name = name;
    }

    void takeFeedback(Manager manager, Customer customer) {
        if (customer.getFeedback() > 0)
            System.out.println(manager.name + " says: " + customer.getName() + " was happy with their stay!");
        else if (customer.getFeedback() < 0)
            System.out.println(manager.name + " says: " + customer.getName() + " was unhappy with their stay!");
        else
            System.out.println(manager.name + " says: " + customer.getName() + " found their stay ok.");
    }

}