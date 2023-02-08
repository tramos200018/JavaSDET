import java.util.Arrays;
import java.util.Scanner;

public class TraverseString {
	
	public static String traverse(String s) {
		
		char[] arr = s.toCharArray();
		
		String ans;
		
		int index = 0;
		
		
		for(int i = 0; i<s.length(); i++) {
			
			int j;
			for(j = 0; j<i; j++) {
					if(arr[i] == arr[j]) {
						break;
					}
			}
			
			if(j==i) {
				arr[index++] = arr[i];
			}
			
			
		}
		
		ans = new String(Arrays.copyOf(arr, index));
		
		return ans;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a sentence");
		
		Scanner obj = new Scanner(System.in);
		
		String s = obj.nextLine().toLowerCase();
		
		System.out.println(traverse(s));
		
		

	}

}
