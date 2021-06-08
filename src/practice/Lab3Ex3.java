package practice;
import java.util.*;

public class Lab3Ex3 {
	  

		public static void main(String args[]) {
		
			String initial, rev = "";
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			System.out.println("Eguyga to reverse");
			initial = s.nextLine();
			int length = initial.length();
			for (int i = length - 1; i >= 0; i--)
				rev = rev + initial.charAt(i);
			System.out.println("Reversed string: " + rev);
		}
	}

