
public class odd {

	public static void main(String[] args) {
		int a[] = {2, 2, 3, 3, 3};
		int count_odd = 0;
		int count_even = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count_even ++;
			}
			if(a[i] % 2 != 0) {
				count_odd ++;
			}	
		}
		if (count_even == count_odd) {
			//return true;
			System.out.println("true");
		}
		
		else {
			//return false;
			System.out.println("false");
		}
	}

}
