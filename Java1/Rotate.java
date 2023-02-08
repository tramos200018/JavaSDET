import java.util.Scanner;

public class Rotate {
	
	public static String rotate(String s, int n) {
		String ans = s;
		
		
		for(int i = n; i>0; i--) {
			ans = ans.substring(1) + ans.substring(0, 1);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a word and a number");
		
		Scanner obj = new Scanner(System.in);
		
		String s = obj.nextLine();
		String[] array = s.split(" ");
		String word = array[0];
		int num =  Integer.parseInt(array[1]);
		
		System.out.println(rotate(word, num));
	}

}
