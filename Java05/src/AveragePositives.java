
public class AveragePositives {
	public static void main(String[] args) {
		String [] answer = {"1", "2", "4"};
		main2(answer);
		
	}
	public static void main2(String[] args) {
		double input, average = 0;
		if (args.length > 0) {
			for (int i = 0; i < args.length; i++) {
				input = Double.parseDouble(args[i]);
				if (input > 0) {
					average += input;
				}
			}
			System.out.println(average / args.length);
		} else {
			System.out.println(0);
		}
	}
}
