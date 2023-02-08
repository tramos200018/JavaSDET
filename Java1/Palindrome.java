import java.util.Scanner;

public class Palindrome {
	
	public static Boolean isPalindrome(String s) {
		String reverse = "";
		
		for(int i = 0; i<s.length(); i++) {
			reverse = s.charAt(i) + reverse;
		}
				
		
		if(reverse.equals(s)) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a word");
		
		Scanner obj = new Scanner(System.in);
		
		String s = obj.nextLine().toLowerCase();
		
		if(isPalindrome(s)) {
			System.out.println(s + " is a palindrome");
		}
		else {
			System.out.println(s + " is not a palindrome");
		}

	}

}
