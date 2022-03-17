package Part2;

public class Mode {
	public int mode(int[] arr) {
		if (arr.length == 0) {
			return 0;
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		int[] answer = new int[max + 1];
		for (int i = 0; i < arr.length; i++) {
			answer[arr[i]]++;
		}
		int maxCount = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] > maxCount) {
				maxCount = answer[i];
			}
		}
		int cnt = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == maxCount) {
				cnt++;
			}
		}
		int mode = 0;
		int idx = 0;
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] == maxCount) {
				mode = i;
				return mode;
			}
		}
		return mode;
	}

	public static void main(String[] args) {
//		1, m.mode(new int[]{1,2,3,3,2,1,1})
		Mode m = new Mode();
		int ans = m.mode(new int[] { 1, 2, 3, 3, 2, 1, 1 });
		System.out.println(ans);
	}
}
