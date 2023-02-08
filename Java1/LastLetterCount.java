import java.util.Scanner;

public class LastLetterCount {
	
	public static String switchSY(String s) {
		String[] array  = s.split(" ");
		
		String first  = "";
		
		String last = "";
		
		int index1 = 0;
		
		int index2 = 0;
		
		
		for(int i = 0; i<array.length; i++) {
			if(array[i].endsWith("s")) {
				first = array[i];
				index1 = i;
				break;
			}
			
		}
		
		for(int i = 0; i<array.length; i++) {
			if(array[i].endsWith("y")) {
				last = array[i];
				index2 = i;
				break;
			}
			
		}
		
		String s1 = array[index1];
		
		array[index1] = array[index2];
		
		array[index2] = s1;
		
		String ans = "";
		
		for(int i = 0; i<array.length; i++) {
			ans = ans + array[i] + " ";
		}
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter a sentence");
		
		Scanner obj = new Scanner(System.in);
		
		String s = obj.nextLine();
		
		System.out.println(switchSY(s));

	}

}
