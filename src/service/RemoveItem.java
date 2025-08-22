package service;
import java.util.*;
public class RemoveItem {

	public static void execute(RestaurantService service) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter item name to remove: ");
		String name = scanner.nextLine();
		service.removeItem(name);
		System.out.println("Item removed successfully!");
		scanner.close();
	}

}
