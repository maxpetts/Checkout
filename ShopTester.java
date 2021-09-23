package eeub35.bangor.ac.uk;

public class ShopTester {
	public static void main(String[] args) {
		Shop shop = new Shop();
		int i = 0;
		int rand = getRand(7, 20);
		
		System.out.println("creating " + rand + " customers");
		
		while(i <= rand) {
			shop.addCustomerToBestQueue();
			i++;
		}
	}
	
	private static int getRand(int lowerBound, int upperBound) {
		return (int) (Math.random() * upperBound) + lowerBound;
	}
}
