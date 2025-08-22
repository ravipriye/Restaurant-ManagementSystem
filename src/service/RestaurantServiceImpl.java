package service;

import model.MenuItem;
import java.util.ArrayList;
import java.util.List;

public class RestaurantServiceImpl implements RestaurantService {
	private List<MenuItem> menu = new ArrayList<>();

	public void addItem(MenuItem item) {
		menu.add(item);
	}

	public void removeItem(String itemName) {
		menu.removeIf(item -> item.getName().equalsIgnoreCase(itemName));
	}

	public List<MenuItem> getMenu() {
		return menu;
	}
}
