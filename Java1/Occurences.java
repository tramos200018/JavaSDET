import java.util.ArrayList;
import java.util.Arrays;

public class Occurences {

	
	public static void occurences(int[] a) {
		boolean[] counted = new boolean[a.length];
		
		Arrays.fill(counted, false);
		
		for(int i = 0; i<a.length; i++) {
			if(counted[i] == true) {
				continue;
			}
			
			int count = 1;
			
			for(int j = i+1; j<a.length; j++) {
				if(a[j] == a[i]) {
					counted[j] = true;
					count++;
				}
			}
			System.out.println(a[i] + ": " + count);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 10, 5, 12, 3, 5};
	    
	    occurences(arr);

	}

}
