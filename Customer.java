package eeub35.bangor.ac.uk;

public class Customer {
	
	private int items;
	private int id;
	
	public Customer(int id, int itemNo) {
		this.id = id;
		items = itemNo;
		System.out.println("Customer created with " + itemNo + " items");
	}
	
	public int getItemAmount() {
		return items;
	}

	public void removeItem() {
		items--;
	}
	
	
	public int getID() {
		return id;
	}
}
