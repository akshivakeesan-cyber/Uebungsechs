package h3;
import java.util.Arrays;
public class H3_main {
	

	
		public static void main ( String []args)
		{
			int a [] = {1, 10, -3, 2}; 
			
			System.out.println(methode(a));
		}
		
		public static int methode(int[] a) {
			
			if (a.length < 2) return -1;
			
			for (int c = 0; c<a.length; c++)
			{
				a[c] = Math.abs(a[c]);
			}
			
			Arrays.sort(a);
			
			int zweitGroße = a[a.length -2];
	        
	        
	        return zweitGroße;
	    }
}
