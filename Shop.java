import java.io.InputStreamReader;
import javax.swing.JPanel;

public class Shop extends JPanel {
	
	private Checkout check1;
	private Checkout check2;
	private Checkout check3;
	private CheckoutRunnable r1, r2, r3;
	private int count = 0;
	private Thread t1;
	private Thread t2;
	private Thread t3;
	
	public static void main(String[] args) {
		Shop shop = new Shop();		
	}
	
	public Shop() {
		// Checkout 
		check1 = new Checkout(1);
		check2 = new Checkout(2);
		check3 = new Checkout(3);

		r1 = new CheckoutRunnable(check1);
		r2 = new CheckoutRunnable(check2);
		r3 = new CheckoutRunnable(check3);
		
		t1 = new Thread(r1);
		t2 = new Thread(r2);
		t3 = new Thread(r3);
		t1.start();
		t2.start();
		t3.start();
	}
	
	public void addCustomerToBestQueue() {
		Customer customer = new Customer(count, getRand(1,35));
		
		count++;
		
		if (check1.getQueueSize() <= check2.getQueueSize() && check1.getQueueSize() <= check3.getQueueSize()) {
			check1.addCustomer(customer);
			System.out.println("Customer " + customer.getID() + " added to checkout 1");
		} else if (check2.getQueueSize() <= check3.getQueueSize() && check2.getQueueSize() <= check3.getQueueSize()) {
			check2.addCustomer(customer);
			System.out.println("Customer " + customer.getID() + " added to checkout 2");
		} else {
			check3.addCustomer(customer);
			System.out.println("Customer " + customer.getID() + " added to checkout 3");
		}
	}
	
	private static int getRand(int lowerBound, int upperBound) {
		return (int) (Math.random() * upperBound) + lowerBound;
	}
}
