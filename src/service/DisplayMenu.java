
package service;

public class DisplayMenu {
	public static void execute(RestaurantService service) {
		System.out.println("Menu:");
		service.getMenu().forEach(System.out::println);
	}
}
