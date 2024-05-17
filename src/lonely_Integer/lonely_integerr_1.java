package lonely_Integer;

import java.util.*;

public class lonely_integerr_1 {

	public static void main(String[] args) {
		int[] ar = {4,3,2,1,2,3,4};
		
		HashSet<Integer> chandan = new HashSet<Integer>();
		
		
		for(int i : ar) 
		{
				
			if(chandan.contains(ar[i]))
			{
				chandan.remove(ar[i]);
			} else 
			{
				chandan.add(ar[i]);
			}
		
			for(int lonelyInteger : chandan) {
				System.out.println(lonelyInteger);
			}

		}	
}
}
