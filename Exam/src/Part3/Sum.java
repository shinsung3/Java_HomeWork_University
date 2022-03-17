package Part3;

import java.util.ArrayList;
import java.util.List;

interface Summable<T> {
    int getVal(T t);
}

public class Sum {
    // Task 1: sum method
    // Your code here
	public int Sum(List<String> list, Summable summable) {
		int len = 0;
		for(int i=0; i<list.size(); i++) {
			len += summable.getVal(list.get(i));
		}
		return len;
	}
	
	public static void main(String[] args) {
		Sum s = new Sum();
		List<String> l = new ArrayList();
		l.add("a");
		l.add("aa");
		l.add("");
		
		int ans = s.Sum(l, new StringLengthSum());
		System.out.println(ans);
//      t.checkExpect(3, s.sum(l, new StringLengthSum()));
	}
}