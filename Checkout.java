package eeub35.bangor.ac.uk;

import java.util.LinkedList;
import java.util.Queue;

public class Checkout {
	
	private Queue<Customer> customers = new LinkedList();
	private int checkoutID;
	
	public Checkout(int id) {
		checkoutID = id;
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void removeCustomer() {
		customers.remove();
	}

	public Customer getCustomer() {
		return customers.peek();
	}
	
	public int getQueueSize() {
		return customers.size();
	}
	
	public Queue<Customer> getQueueList() {
		return customers;
	}

	public int getID() {
		return checkoutID;
	}

	
	
}
