package ui;

import service.*;
import java.util.*;

public class MainUi {
    public static void main(String[] args) {
        RestaurantService service = new RestaurantServiceImpl();
        int choice;
        boolean b=true;
        Scanner scanner = new Scanner(System.in);
        while(b){
            System.out.println("\n--- Restaurant Management System ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Menu");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 :
                	AddItem.execute(service);
                	break;
                case 2 :
                	RemoveItem.execute(service);
                	break;
                case 3 :
                	DisplayMenu.execute(service);
                	break;
                
                case 4 :
                	System.out.println("Exiting...");
                	return;
                	
                default :
                	System.out.println("Invalid choice!");
            }
        } 
        scanner.close();
    }
}
