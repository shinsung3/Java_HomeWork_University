public class PairSelect {
	//3. write method getAs
	public int[] getAs(Pair[] other) {
		int[] answer = new int[other.length];
		for(int i=0; i<other.length; i++) {
			answer[i] = other[i].a;
		}
		return answer;
	}
}

//1. pair class
class Pair{ // (1,2)
	int a;
	int b;
	//2. pair constructor
	public Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
