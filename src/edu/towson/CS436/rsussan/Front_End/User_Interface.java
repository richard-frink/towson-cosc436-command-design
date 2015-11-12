package edu.towson.CS436.rsussan.Front_End;

/**
 * User Interface.
 * Interacts with system interface to display appropriate information.
 * 
 * @author Richard Sussan
 *
 */

import java.util.*;
public class User_Interface {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String thingy = scan.next();
		System.out.print(thingy);
		scan.close();
	}

}
