import java.util.Random;
import java.util.Arrays;

public class RndUnq {
	public static void main(String[] args) {
		int[] ar = new int[10];
		Random rnd = new Random();

		ar[0] = rnd.nextInt(10);
		int c = 1;
    // c is a counter to use in compairing the numbers in an array
    // i is an index for the cells in the array
    
		for (int i = 1; i < 10; i++) {

			ar[i] = rnd.nextInt(10);
			
			while (c <= i) {

				if (ar[i] != ar[i - c]) {
					c++;
				} else {
					ar[i] = rnd.nextInt(10);
					continue;

				}
			}
		}
		System.out.println(Arrays.toString(ar));

	}

}
