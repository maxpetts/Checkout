public class CheckoutRunnable implements Runnable {

	private Checkout checkout;
	private Customer customer;

	public CheckoutRunnable(Checkout check) {
		checkout = check;
	}

	public void run() {
		// TODO Auto-generated method stub
		while (checkout.getQueueSize() != 0) {
			if (checkout.getQueueSize() > 0) {

				Customer customer = checkout.getCustomer();

				while (customer.getItemAmount() != 0) {
					try {
						Thread.sleep((int) (300 + (Math.random() * 500)));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					customer.removeItem();
				}
				checkout.removeCustomer();
				System.out.println("Customer " + customer.getID() + " done in: checkout " + checkout.getID());

				// after all items are checked the next customer is got
			} else { // if the queue is empty the thread is made to sleep for 2 seconds
				System.out.println("No Customers in checkout " + checkout.getID());
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
