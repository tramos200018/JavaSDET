import java.util.Scanner;

public class Words {
	
	public static int[] wordCount(String s) {
		int count = 0;
		
		String[] array = s.split(" ");
		int[] counts = new int[2];
		
		for(int i = 0; i<array.length; i++) {
			if(array[i].equals("word")) {
				count++;
			}
		}
		
		counts[0] = array.length;
		counts[1] = count;
		
		
		return counts;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a sentence");
		
		Scanner obj = new Scanner(System.in);
		
		String s = obj.nextLine().toLowerCase();
		
		int[] ans = wordCount(s);
		
		System.out.println("Number of words: " + ans[0]);
		System.out.println("\"Word\" count: " + ans[1]);
	}

}
