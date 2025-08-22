package service;

import model.MenuItem;
import java.util.Scanner;

public class AddItem {

	public static void execute(RestaurantService service) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter item name: ");
		String name = scanner.nextLine();
		System.out.print("Enter item price: ");
		double price = scanner.nextDouble();
		service.addItem(new MenuItem(name, price));
		System.out.println("Item added successfully!");
	}

}
