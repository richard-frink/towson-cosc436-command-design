package edu.towson.CS436.rsussan.Front_End;

/**
 * User Interface.
 * Interacts with system interface to display appropriate information.
 * 
 * @author Richard Sussan
 *
 */

import java.util.*;
import edu.towson.CS436.rsussan.Back_End.System_Interface;

public class User_Interface {
	public static void main(String[] args) {
		System_Interface sys = new System_Interface();
		
		Scanner scan = new Scanner(System.in);
		
		String thingy = scan.next();
		
		System.out.print(thingy);
		
		scan.close();
	}

}
