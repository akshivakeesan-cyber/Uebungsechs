package h3;

public class H3_main {

	public static void main (String []args) {
		
	int []a = {1,2,3}; 
	int []b = {1,2,3};
		
	System.out.println(compareArraysVal(a,b));	
	}
	
	
	public static boolean compareArraysVal(int []a, int[]b)
	{
		if (a.length != b.length)
		{
			return false;
		}
		
		
		
		for (int i = 0; i<a.length; i++)
		{
			int wert = a[i];
			
			int zaehlendeA = 0;
			int zaehlendeB = 0;
			
			
			for (int j = 0; j < a.length; j++) {
				
				if(a[j]== wert)
				{
					zaehlendeA++;
				}
				
			}
			for(int k = 0; k<a.length; k++)
			{
				if (b[k] == wert)
				{
					zaehlendeB++;
				}
			}
			
			if (zaehlendeA != zaehlendeB)
			{
				return false;
			}
		}
		
		return true; 
	}
	
}