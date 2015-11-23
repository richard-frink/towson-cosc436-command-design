package edu.towson.CS436.rsussan.Front_End;

/**
 * User Interface.
 * Interacts with system interface to display appropriate information.
 * 
 * @author Richard Sussan
 *
 */

import edu.towson.CS436.rsussan.Back_End.System_Interface;
import java.util.*;

public class User_Interface {
	public static void main(String[] args) {
		
		/**
		 * 1.display menu
			 * 1.full menu
			 * 2.type specific menu
			 * 3.heart healthy menu
			 * 4.price specific menu
		 * 2.order items
		 * 3.show current order
		 */
		boolean cont = true;
		while(cont){
			Scanner scan = new Scanner(System.in);
			String[] str;
			displayMenu();
			System.out.print("Please enter an option: ");
			int option = getMenuOption(scan);
			switch(option){
				case 1:
					str = System_Interface.getMenu();
					displayOutput(str);
					System.out.println();
					break;
				case 2:
					str = System_Interface.getMenu();
					displayOutput(str);
					System.out.println();
					boolean cont2 = true;
					int[] arr = new int[100];
					int temp = 0;
					while(cont2){
						System.out.print("Enter a menu item you would like: ");
						arr[temp] = getMenuItem(scan);
						temp++;
						System.out.print("Item added!\n Would you like to add more items? (y/n): ");
						String more = scan.next();
						if(more.equalsIgnoreCase("y")) continue;
						else cont2 = false;
					}
					str = System_Interface.submitOrder(arr);
					displayOutput(str);
					System.out.println();
					break;
				case 3:
					str = System_Interface.getOrder();
					displayOutput(str);
					System.out.println();
					break;
				case 4:
					cont = false;
					System.exit(0);
			}
			System.out.print("Would you like to continue? (y/n): ");
			String temp = scan.next();
			if(temp.equalsIgnoreCase("y"))
				System.out.println();
			else cont = false;
		}
		
		/**
		 * 
		 * ALL OF THIS IS TO BE IMPLEMENTED AFTER INITIAL CODE DEADLINE

		str = sys.getHHMenu();
		displayOutput(str);
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a max price to get a list of those items: ");
		double temp = scan.nextDouble();
		str = sys.getPriceMenu(temp);
		displayOutput(str);
		scan.close();

		*/
		
	}
	
	public static void displayMenu(){
		System.out.println("OPTIONS:");
		System.out.println("1 - Display Menu");
		System.out.println("2 - Order Items");
		System.out.println("3 - Show Current Order");
		System.out.println("4 - Exit");
	}
	
	public static void displayOutput(String[] str){
		int x = 0;
		while(str[x] != null){
			System.out.println(str[x]);
			x++;
		}
	}
	
	public static int getMenuOption(Scanner scan){
		int temp = scan.nextInt();
		while(temp > 4 || temp < 1){
			System.out.println();
			System.out.print("Please enter an option: ");
			temp = scan.nextInt();
		}
		return temp;
	}
	
	public static int getMenuItem(Scanner scan){
		int temp = scan.nextInt();
		while(temp > 21 || temp < 1){
			System.out.println();
			System.out.print("Please enter an option: ");
			temp = scan.nextInt();
		}
		return temp;
	}
}
