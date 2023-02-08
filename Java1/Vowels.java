import java.util.Scanner;

public class Vowels {
	
	public static int vowelCount(String s) {
		char[] sentence = s.toCharArray();
		int count = 0;
		
		for(int i = 0; i<sentence.length; i++) {
			if(sentence[i] == 'a')
				count++;
			if(sentence[i] == 'e')
				count++;
			if(sentence[i] == 'i')
				count++;
			if(sentence[i] == 'o')
				count++;
			if(sentence[i] == 'u')
				count++;
			
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a sentence");
		
		Scanner obj = new Scanner(System.in);
		
		String s = obj.nextLine().toLowerCase();
		
		System.out.println(vowelCount(s));

	}

}
