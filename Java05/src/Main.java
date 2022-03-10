import java.util.Arrays;
import tester.*;

public class Main {
	PairSelect a = new PairSelect();
//	Pair b = new Pair(1, 2);
//	Pair c = new Pair(3, 2);
//	Pair d = new Pair(4, 2);
//	Pair e = new Pair(5, 2);
//	Pair[] arr = { b, c, d, e };

	void testAdd(Tester t) {
//		t.checkExpect(this.a.getAs(arr),);
	}
	public static void main(String[] args) {
		PairSelect a = new PairSelect();
		Pair b = new Pair(1, 2);
		Pair c = new Pair(3, 2);
		Pair d = new Pair(4, 2);
		Pair e = new Pair(5, 2);
		Pair[] arr = new Pair[4];
		arr[0] = new Pair(1, 2);
		arr[1] = new Pair(3, 2);
		arr[2] = new Pair(4, 2);
		arr[3] = new Pair(5, 2);
		
		int[] brr = {1,3,4,5};
		Tester t = new Tester();
		System.out.println(Arrays.toString(a.getAs(arr)));
		System.out.println(Arrays.toString(brr));
		t.checkExpect(a.getAs(arr), brr);
	}
}
