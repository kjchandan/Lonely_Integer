package lonely_Integer;

import java.util.*;
public class lonley_Integer {

	public static void main(String[] args) {
		int[] ar= {4,3,2,1,2,3,4,}; //Find the digit that is not repeated.
		
		Arrays.sort(ar); //1)Sort 
		
		for(int i=0;i<ar.length-1;i=i+2) 
		{
			if(ar[i] != ar[i+1])  //Check is there are same elements one beside other.
			{
				System.out.println(ar[i]); //if there is no elemts one beisde other display that.
				return;
			}
		}
		System.out.println(ar[ar.length-1]);
		

	}

}
