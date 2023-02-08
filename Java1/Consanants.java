import java.util.Scanner;

public class Consanants {
	
	public static String[] count(String s) {
		int count  =  0;
		
		char[] array = s.toCharArray();
		String[] ans = new String[2];
		
		for(int i = 0; i<array.length; i++) {
			if(array[i] != 'a' && 
					array[i] != 'e' && 
					array[i] != 'i' && 
					array[i] != 'o' && 
					array[i] != 'u' &&
					array[i] != ' ') 
			{
				count++;
				array[i] = '*';
			}
				
		}
		
		ans[0] = Integer.toString(count);
		ans[1] = new String(array);
		
		return ans;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a sentence");
		
		Scanner obj = new Scanner(System.in);
		
		String s = obj.nextLine().toLowerCase();
		
		String[] ans = count(s);
		
		System.out.println("Consonant count: " + ans[0]);
		System.out.println("New string: " + ans[1]);

	}

}
