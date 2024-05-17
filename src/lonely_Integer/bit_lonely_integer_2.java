package lonely_Integer;

public class bit_lonely_integer_2 {
	public static void main(String[] args) {
		
		int[] arr = {4,3,2,1,4,3,2};
		
		int result =0;
		
		for( int i : arr) {
			result = result ^ i;
		}
		System.out.println(result);
	}
}

