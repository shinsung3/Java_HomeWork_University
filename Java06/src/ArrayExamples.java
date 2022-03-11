import java.util.Arrays;

public class ArrayExamples {
	public static String joinWith(String[] s, String sep) {
		String str = "";
		for (int i = 0; i < s.length; i++) {
			str += s[i]; // {"a", "b", "c"}
			if (i != s.length - 1) {
				str += sep;
			}
		}
		return str;
	}

	public static boolean somethingFalse(boolean[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == true) {
				return true;
			}
		}
		return false;
	}

	public static int countWithinRange(double[] array, double low, double high) {
		int answer = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= low && array[i] <= high) {
				answer++;
			}
		}
		return answer;
	}

	public static double[] numsWithinRange(double[] array, double low, double high) {
		double answer[] = new double[countWithinRange(array, low, high)];
		int idx = 0;
		for(int i=0; i<array.length; i++) {
			if (array[i] >= low && array[i] <= high) {
				answer[idx] = array[i]; 
				idx++;
			}
		}
		return answer;
	}
	
	public static Pair maxmin(int[] array) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max =array[i];
			}
			if(min > array[i]) {
				min = array[i];
			}
		}
		return new Pair(min, max);
	}
	
	public static String earliest(String[] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				if(array[i].compareTo(array[j]) <1) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		return array[0];
	}

	public static void main(String[] args) {
		ArrayExamples a = new ArrayExamples();
		String answer = a.joinWith(new String[] {}, ":");
		System.out.println(answer);

		boolean answer2 = a.somethingFalse(new boolean[] {});
		System.out.println(answer2);

		int answer3 = a.countWithinRange(new double[] {0.1,1.3, 2.6}, 1.1, 2.3);
		System.out.println(answer3);

		double[] example = { 0.0, 3.0, 1.4, 1.5, 2.7, 9.1, 2.1 };
		double[] expected = { 1.4, 1.5, 2.1 };
		double[] answer4 = a.numsWithinRange(example, 1.1, 2.2);
		System.out.println(Arrays.toString(answer4));
		
		int[] array = {4, 5, 2, 3, 1};
		Pair answer5 = a.maxmin(array);
		System.out.println(answer5.a);
		System.out.println(answer5.b);
		
		String[] example2 = {"aa", "aab", "abcd", "a"};
		String answer6 = a.earliest(example2);
		System.out.println(answer6);
	}
}

//Add Pair at the top level, outside the ArrayExamples class
class Pair{
	int a;
	int b;
	public Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
}
