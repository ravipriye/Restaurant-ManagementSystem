
package service;

import model.MenuItem;
import java.util.List;

public interface RestaurantService {
	void addItem(MenuItem item);

	void removeItem(String itemName);

	List<MenuItem> getMenu();
}
