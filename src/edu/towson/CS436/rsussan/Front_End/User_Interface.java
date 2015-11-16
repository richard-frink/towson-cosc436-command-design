package edu.towson.CS436.rsussan.Front_End;

/**
 * User Interface.
 * Interacts with system interface to display appropriate information.
 * 
 * @author Richard Sussan
 *
 */

//import java.util.*;
import edu.towson.CS436.rsussan.Back_End.System_Interface;

public class User_Interface {
	public static void main(String[] args) {
		System_Interface sys = new System_Interface();
		
		
		
		/**
		 * 1.display menu
			 * 1.full menu
			 * 2.type specific menu
			 * 3.heart healthy menu
			 * 4.price specific menu
		 * 2.show current orders
		 * 3.add to current orders
		 */
		
		
		
		
		String[] str = sys.getMenu();
		
		displayOutput(str);
		System.out.println();
		
		str = sys.getHHMenu();
		
		displayOutput(str);
		System.out.println();
		
		
	}
	
	public static void displayOutput(String[] str){
		int x = 0;
		while(str[x] != null){
			System.out.println(str[x]);
			x++;
		}
	}
}
