/**
 *  Author: MazzyK
 *  Description: A java implementation to find whether a given integer is a palindrome of itself
 */

package integerdigits;
import java.util.Scanner;


public class digits {
	
	public static int getNum() {
		try (Scanner kb = new Scanner(System.in)) {
			System.out.println("Enter an integer");
			int num = kb.nextInt();
			return num;
		}
	}
	
	public static boolean isPalindrome (int x) {
		int length = String.valueOf(x).length();
		boolean isPalindrome = true;
		int[] digits = new int[length];
		int i=0;
		
		if(x<0) {
			isPalindrome=false;
		}

		while (x > 0) {
		   
		    digits[i]= x % 10;
		    x = x / 10;
		    i++;    
		}
		
		int k =length-1;
		for (int j=0; j<length; j++) {
			
			if(digits[j]!= digits[k]) {
				isPalindrome = false;
			}
			
			k--;
			
		}
		
		return isPalindrome;
		

	}

	public static void main(String[] args) {
		
		int number = getNum();
		
		if(isPalindrome(number)==true) {
			System.out.println(number + " is a palindrome");
		}else {
			System.out.println(number + " is not a palindrome");
		}
		
		
		
	}

}
