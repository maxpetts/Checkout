package eeub35.bangor.ac.uk;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShopCLI {

	private static Shop shop;
	private static int decision;
	private static boolean quit = false;

	public static void main(String[] args) {
		while (quit != true) {
			Scanner in = new Scanner(System.in);
			System.out.println(" Welcome to Tesbury's");
			System.out.println("**********************");

			System.out.println("1. Add Customer\n2. To report on positions\n3. Quit");
			System.out.println("Select option [1,2] : ");
			try {
				int decision = in.nextInt();
			} catch (InputMismatchException ime) {
				System.out.println("Please enter either 1 or 2");
			}

			shop = new Shop();

			switch (decision) {
			case 1:
				shop.addCustomerToBestQueue();
				break;
			case 2:
				
			}
		}
	}
}
